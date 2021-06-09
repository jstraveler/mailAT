package TestClasses;

import BaseClasses.TestMain;
import PageClasses.*;
import org.junit.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static com.google.common.truth.Truth.*;
import static com.google.common.truth.Truth8.*;

public class TestLogin extends TestMain {
    UserPage userPage;

    @Before
    public void start() {
        setUp();
        get();
    }

    //@Test
    public void testLogin() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        new WebDriverWait(userPage.getDriver(), 1).until(ExpectedConditions.urlToBe(userUrl));
        assertThat(userPage.getDriver().getCurrentUrl())
                .endsWith(userUrl);
        assertThat(userPage).isNotNull();
    }

    //@Test
    public void testIncorrectLogin() {
        userPage = new LoginPage(driver).checkLogin(login, "pass");
        new WebDriverWait(userPage.getDriver(), 1);
        assertThat(userPage.getDriver().getCurrentUrl())
                .contains("error");
        assertThat(userPage).isNotNull();
    }

    @After
    public void stop() {
        tearDown();
    }
}




    /*@Test
    public void whenPageIsNull() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        assertThat(userPage).isNull();
    }

    @Test
    public void whenPageIsNotNull() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        assertThat(userPage).isNotNull();
    }

    @Test
    public void isPageInstanceOf() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        assertThat(userPage).isInstanceOf(UserPage.class);
    }

    @Test
    public void isURLCorrect() {
        String groupUrl = "https://ok.ru/profile";
        userPage = new LoginPage(driver).checkLogin(login, pass);
        groupPage = userPage.moveToGroups();
        new WebDriverWait(groupPage.getDriver(), 1).until(ExpectedConditions.urlContains("https://ok.ru/profile"));
        assertThat(groupPage.getDriver().getCurrentUrl()).startsWith(groupUrl);
    }

        Assert.assertTrue(String.valueOf(groupPage.avatarLocators.size()), groupPage.avatarLocators.size() > 12);
        assertThat(groupPage.avatarLocators.size()).isNotNull();
        assertThat(groupPage.avatarLocators).containsExactlyElementsIn(new ArrayList<>());
        assertWithMessage("TEST-1: Secret user subject was NOT null!")
                .that(userPage)
                .isEqualTo(new UserPage(null));
         */

    /*@Test
    public void isURLCorrect() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        groupPage = userPage.moveToGroups();
        groupPage.checkCategory();
        assertThat(groupPage.avatarLocators).containsExactlyElementsIn(new ArrayList<>());
        assertThat(groupPage.avatarLocatorsMap).containsKey("Auto");
        assertThat(groupPage.avatarLocators).isEmpty();
        assertThat(groupPage.avatarLocators);


    }

    @Test
    public void useStream() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        groupPage = userPage.moveToGroups();
        groupPage.checkCategory();
        Stream<Object> streamGroupItem = Stream.of(groupPage.avatarLocators.toArray());
        assertThat(streamGroupItem).containsNoDuplicates();
    }*/
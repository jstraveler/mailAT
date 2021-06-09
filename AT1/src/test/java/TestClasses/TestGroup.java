package TestClasses;

import BaseClasses.TestMain;
import PageClasses.GroupPage;
import PageClasses.LoginPage;
import PageClasses.UserPage;
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageClasses.SomeVariables.groupsCategoryLocators;
import static com.google.common.truth.Truth.assertThat;

public class TestGroup extends TestMain {
    UserPage userPage;
    GroupPage groupPage;

    @Before
    public void start() {
        setUp();
        get();
    }

    //@Test
    public void testGroups() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        new WebDriverWait(userPage.getDriver(), 1).until(ExpectedConditions.urlToBe(userUrl));
        assertThat(userPage.getDriver().getCurrentUrl()).endsWith(userUrl);

        groupPage = userPage.moveToGroups();
        assertThat(groupPage).isNotNull();

        for (String categoryLocators : groupsCategoryLocators) {
            groupPage.checkCategory(categoryLocators);
        }

    }

    //@Test
    public void checkGroups() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        new WebDriverWait(userPage.getDriver(), 1).until(ExpectedConditions.urlToBe(userUrl));
        assertThat(userPage.getDriver().getCurrentUrl()).endsWith(userUrl);

        groupPage = userPage.moveToGroups();
        assertThat(groupPage).isNotNull();

        for (String categoryLocators : groupsCategoryLocators) {
            groupPage.checkCategoryItem(categoryLocators);
        }

    }

    @After
    public void stop() {
        tearDown();
    }
}

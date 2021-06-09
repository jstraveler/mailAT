package TestClasses;

import PageClasses.*;
import org.junit.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageClasses.SomeVariables.menusURL;
import static com.google.common.truth.Truth.assertThat;

public class TestFriends extends TestMenu {
    UserPage userPage;

    @Before
    public void start() {
        setUp();
        get();
    }

    @Test
    public void foo() {
        userPage = new LoginPage(driver).checkLogin(login, pass);
        new WebDriverWait(userPage.getDriver(), 1).until(ExpectedConditions.urlToBe(userUrl));
        assertThat(userPage.getDriver().getCurrentUrl()).endsWith(userUrl);

        FriendsPage fp = new FriendsPage(driver);
        fp.findFriend();



    }

    @After
    public void stop() {
        tearDown();
    }

}

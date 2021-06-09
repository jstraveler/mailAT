package TestClasses;

import BaseClasses.TestMain;
import PageClasses.GroupPage;
import PageClasses.LoginPage;
import PageClasses.MenuBar;
import PageClasses.UserPage;
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageClasses.SomeVariables.menusURL;
import static com.google.common.truth.Truth.assertThat;

public class TestMenu extends TestMain {
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

        MenuBar mb = new MenuBar(driver);
        int menusCount = mb.getMenusCount();

        for (int i = 0; i < menusCount; i++) {
            String testedMenusURL = menusURL.get(i);
            mb.checkMenu(mb.menuLocators.get(i), testedMenusURL, mb.expectedElementLocators.get(i));
            System.out.println(testedMenusURL);
        }




    }

    @After
    public void stop() {
        tearDown();
    }


}

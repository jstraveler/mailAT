import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends MainTest {
    UserPage userPage;
    GroupPage groupPage;
    String login = "89626800887";
    String pass = "1478963";

    @Before
    public void start() {
        setUp();
        get();
    }

    @Test
    public void test() {
        userPage = new LoginPage(driver).checkLogin(login, pass);

        groupPage = userPage.moveToGroups();

        groupPage.checkCategory();
        //Assert.assertTrue(String.valueOf(groupPage.avatarLocators.size()), groupPage.avatarLocators.size() > 0);
    }

    @After
    public void stop() {
        tearDown();
    }
}

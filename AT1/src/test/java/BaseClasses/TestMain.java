package BaseClasses;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import PageClasses.LoginPage;

public class TestMain {
    public WebDriver driver;
    public String baseUrl = "https://www.google.com/";
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();
    public LoginPage loginPage;
    public String userUrl = "https://ok.ru/";
    public String login = ""; // Добавить свой логин
    public String pass = ""; // Добавить свой пароль

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void get() {
        driver.manage().window();
        driver.get(userUrl);
    }

    public void tearDown() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}

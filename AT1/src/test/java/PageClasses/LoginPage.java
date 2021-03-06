package PageClasses;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    WebDriver driver;
    String loginLocator = ".//input[@id=\"field_email\"]";
    String passLocator = ".//input[@id=\"field_password\"]";
    String signInLocator = ".//input[@value=\"Войти в Одноклассники\"]";

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public UserPage checkLogin(String login, String pass) {
        //driver.get("https://www.ok.ru");
        driver.findElement(By.xpath(loginLocator)).click();
        driver.findElement(By.xpath(loginLocator)).clear();
        driver.findElement(By.xpath(loginLocator)).sendKeys(login);
        driver.findElement(By.xpath(passLocator)).click();
        driver.findElement(By.xpath(passLocator)).clear();
        driver.findElement(By.xpath(passLocator)).sendKeys(pass);
        driver.findElement(By.xpath(signInLocator)).click(); //sendKeys(Keys.ENTER)
        return new UserPage(driver);
    }
}

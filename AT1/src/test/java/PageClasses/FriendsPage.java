package PageClasses;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageClasses.SomeVariables.friendsMenuURL;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertTrue;

public class FriendsPage extends BasePage {
    WebDriver driver;
    // locators
    String friendsMenu = ".//a[contains(@data-l,\"t,userFriend\")]";
    String searchFriends = ".//input[contains(@placeholder,\"Поиск\")]";
    String searchFriendsButton = ".//button[contains(@class,\"search-button\")]";
    String searchingPerson = "дмитрий молотов";
    String advancedSearchButton = ".//a[contains(@class,\"al fs-12\")]";
    String cityVlgButton = ".//li[contains(@class,\"content-item__kht0y disable-list-type__kht0y\") and text()=\"Волгоград, Россия\"]";

    public FriendsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void findFriend() {
        driver.findElement(By.xpath(friendsMenu)).click();
        new WebDriverWait(driver, 1).until(ExpectedConditions.urlContains(friendsMenuURL));
        assertThat(driver.getCurrentUrl()).contains(friendsMenuURL);
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(searchFriends))));
        assertTrue("Элемент не найден", driver.findElement(By.xpath(searchFriends)).isDisplayed());
        driver.findElement(By.xpath(searchFriends)).click();
        driver.findElement(By.xpath(searchFriends)).clear();
        driver.findElement(By.xpath(searchFriends)).sendKeys(searchingPerson);
        driver.findElement(By.xpath(searchFriends)).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(advancedSearchButton))));
        assertTrue("Элемент не найден", driver.findElement(By.xpath(advancedSearchButton)).isDisplayed());
        driver.findElement(By.xpath(advancedSearchButton)).click();
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(cityVlgButton))));
        assertTrue("Элемент не найден", driver.findElement(By.xpath(cityVlgButton)).isDisplayed());
        driver.findElement(By.xpath(cityVlgButton)).click();
        //new WebDriverWait(driver, 1).until(ExpectedConditions.textToBe(By.xpath(searchFriends), "дмитрий"));
    }
}

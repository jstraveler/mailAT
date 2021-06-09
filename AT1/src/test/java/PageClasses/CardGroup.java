package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class CardGroup {
    WebElement driver;
    List<String> groupLocators = new ArrayList<>();
    List<WebElement> cardElements = new ArrayList<>();
    String groupLocatorCard = ".//div[contains(@class, \"ucard\") and contains(@data-l,\"groupId\")]";
    String groupLocatorPhoto = ".//div[contains(@class, \"photo\") and contains(@data-l,\"t,pic\")]";
    String groupLocatorCaption = ".//div[contains(@class, \"ucard-v_h\")]";
    String groupLocatorName = ".//a[contains(@data-l,\"t,visit\")]"; // and contains(@title) Проверить наличие названия
    String groupLocatorFriendsInGroup = ".//div[contains(@class, \"friends-in-group\")]";

    public CardGroup (WebDriver driver){
        //this.driver = driver;
        groupLocators.add(groupLocatorCard);
        groupLocators.add(groupLocatorPhoto);
        groupLocators.add(groupLocatorCaption);
        groupLocators.add(groupLocatorName);
        groupLocators.add(groupLocatorFriendsInGroup);
    }

    public void findCard() {
        for (String locator : groupLocators) {
            cardElements.add(driver.findElement(By.xpath(locator)));
        }
    }



}


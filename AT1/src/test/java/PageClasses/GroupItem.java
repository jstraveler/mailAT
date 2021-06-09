package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class GroupItem {
    WebDriver driver;
    //WebElement element;
    List<WebElement> listItem = new ArrayList<>();
    List<String> groupLocators = new ArrayList<>();
    List<CardGroup> groups = new ArrayList<>();
    String groupLocatorCard = ".//div[contains(@class, \"ucard\") and contains(@data-l,\"groupId\")]";
    String groupLocatorPhoto = ".//div[contains(@class, \"photo\") and contains(@data-l,\"t,pic\")]";
    String groupLocatorCaption = ".//div[contains(@class, \"ucard-v_h\")]";
    String groupLocatorName = ".//a[contains(@data-l,\"t,visit\")]"; // and contains(@title) Проверить наличие названия
    //String groupLocatorNameTitle = ".//a[contains(@title)";
    String groupLocatorFriendsInGroup = ".//div[contains(@class, \"friends-in-group\")]";
    String name;


    public GroupItem(WebDriver driver) {
        this.driver = driver;
        groupLocators.add(groupLocatorCard);
        groupLocators.add(groupLocatorPhoto);
        groupLocators.add(groupLocatorCaption);
        groupLocators.add(groupLocatorName);
        groupLocators.add(groupLocatorFriendsInGroup);
        //name = driver.findElement(By.xpath(groupLocatorNameTitle)).getText();
    }

    public void findGroupItem() {
        for (String locator : groupLocators) {
            new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            listItem.add(driver.findElement(By.xpath(locator)));
            //listItem.add(new CardGroup());
        }
    }
}

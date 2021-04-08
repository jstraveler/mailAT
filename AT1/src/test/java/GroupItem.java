import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GroupItem {
    WebDriver driver;
    //WebElement element;
    List<WebElement> listItem;
    List<String> groupLocators;
    String groupLocatorCard = ".//div[contains(@class, \"ucard\") and contains(@data-l,\"groupId\")]";
    String groupLocatorPhoto = ".//img[contains(@class, \"photo_img\")]";
    String groupLocatorCaption = ".//div[contains(@class, \"caption\")]";
    String groupLocatorName = ".//a[contains(@class, \"group-name\")]"; // and contains(@title) Проверить наличие названия
    String groupLocatorFriendsInGroup = ".//div[contains(@class, \"friends-in-group\")]";

    GroupItem(WebDriver driver) {
        this.driver = driver;
        groupLocators.add(groupLocatorCard);
        groupLocators.add(groupLocatorPhoto);
        groupLocators.add(groupLocatorCaption);
        groupLocators.add(groupLocatorName);
        groupLocators.add(groupLocatorFriendsInGroup);
        findGroupItem();
    }

    private void findGroupItem() {
        for(String locator : groupLocators) {
            listItem.add(driver.findElement(By.xpath(locator)));


        }
    }
}

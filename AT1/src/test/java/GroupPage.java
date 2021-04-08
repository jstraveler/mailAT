import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GroupPage {
    int size;
    WebDriver driver;
    WebElement element;
    String autoCategory = ".//a[contains(@data-l,\"t,automoto\")]";
    String groupLocator = ".//div[contains(@data-l,\"groupId\")]";
    String imageLocator = ".//img[contains(@class, \"photo_img\")]";
    List<WebElement> avatarLocators;
    List<GroupItem> groupItem;
    String autoMotoUrl = "https://ok.ru/groups/automoto";
    List<CardGroup> avatarCards = new ArrayList<>();

    public GroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkCategory() {
        driver.findElement(By.xpath(autoCategory)).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.urlToBe(autoMotoUrl));
        setSize();
        setGroups();
        System.out.println(size);
        if (groupItem.size() > 0) {
            for (GroupItem group : groupItem) {
                for (WebElement element : group.listItem)
                    if (element.isDisplayed()) {
                        System.out.println(element.toString());
                    } else {
                        System.out.println("element not found");
                    }
            }
        }
    }

    public void setSize() {
        size = driver.findElements(By.xpath(groupLocator)).size();
    }

    public void setGroups() {
        for (int i = 0; i < size; i++) {
            groupItem.add(new GroupItem(driver));
        }
    }

    public void getAvatarLocators() {
        List<WebElement> rawCards = driver.findElements(By.xpath(groupLocator));
        for(WebElement element : rawCards){
            CardGroup groupCard = new CardGroup(element);
            avatarCards.add(groupCard);

        }
    }
}

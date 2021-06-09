package PageClasses;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import static PageClasses.SomeVariables.*;

public class GroupPage extends BasePage {
    int size;
    WebDriver driver;
    WebElement element;

    String groupLocator = ".//div[contains(@data-l,\"groupId\")]";
    String imageLocator = ".//div[contains(@class, \"photo\") and contains(@data-l,\"t,pic\")]";
            //".//img[contains(@class, \"photo_img\")]";

    public List<WebElement> avatarLocators;
    List<GroupItem> groupItems = new ArrayList<>();
    String autoMotoUrl = "https://ok.ru/groups/automoto";
    List<CardGroup> avatarCards = new ArrayList<>();

    public GroupPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void checkCategoryItem(String categoryLocator) {
        driver.findElement(By.xpath(categoryLocator)).click();
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(categoryLocator)));
        setSize();
        setGroups();
        System.out.println(size);
        if (groupItems.size() > 0) {
            for (GroupItem group : groupItems) {
                int i = 0;
                for (WebElement element : group.listItem) {

                    if(i == 2) {
                        System.out.println(element.getText());
                    }
                    i++;
                    //System.out.println(group.name);
                    /*if (element.isDisplayed()) {
                        System.out.println(element.toString());
                    } else {
                        System.out.println("element not found");
                    }*/
                }
            }
        }
    }

    public void checkCategory(String categoryLocator) {
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(categoryLocator)));
        driver.findElement(By.xpath(categoryLocator)).click();

            getAvatarLocator();
            System.out.print(categoryLocator + "; ");
            System.out.println(avatarLocators.size());
            //new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imageLocator)));

            /*if (avatarLocators.size() > 0) {
                for (WebElement locator : avatarLocators) {
                    element = locator.findElement(By.xpath(imageLocator));
                    new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imageLocator)));
                    if (element.isDisplayed()) {
                        //System.out.println(element.toString());
                    } else {
                        System.out.println("element not found");
                    }
                }
            }*/
        avatarLocators.clear();
    }

    public void setSize() {
        size = driver.findElements(By.xpath(groupLocator)).size();
        if (size <= 0) {
            size = 1;
        }
    }

    public void setGroups() {
        for (int i = 0; i < size; i++) {
            GroupItem groupItem = new GroupItem(driver);
            groupItem.findGroupItem();
            groupItems.add(groupItem);
        }
    }

    /*public void getAvatarLocators() {
        List<WebElement> rawCards = driver.findElements(By.xpath(groupLocator));
        for(WebElement element : rawCards) {
            //CardGroup groupCard = new CardGroup(element);
            //avatarCards.add(groupCard);
        }
    }*/

    public void getAvatarLocator() {
        avatarLocators = driver.findElements(By.xpath(groupLocator));
    }

    public List<GroupItem> getGroupItem() {
        return groupItems;
    }


}

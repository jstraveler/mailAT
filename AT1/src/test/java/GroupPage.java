import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

public class GroupPage {
    WebDriver driver;
    WebElement element;
    String autoCategory = ".//a[contains(@data-l,\"t,automoto\")]";
    String groupLocator = ".//div[contains(@data-l,\"groupId\")]";
    String imageLocator = ".//img[contains(@class, \"photo_img\")]";
    List<WebElement> avatarLocators;
    String autoMotoUrl = "https://ok.ru/groups/automoto";

    public GroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkCategory() {
        driver.findElement(By.xpath(autoCategory)).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.urlToBe(autoMotoUrl));
        getAvatarLocators();
        System.out.println(avatarLocators.size());
        if(avatarLocators.size() > 0) {
            for(WebElement locator : avatarLocators) {
                element = locator.findElement(By.xpath(imageLocator));
                if(element.isDisplayed()) {
                    System.out.println(element.toString());
                } else {
                    System.out.println("element not found");
                }
            }
        }
    }

    public void getAvatarLocators() {
        avatarLocators = driver.findElements(By.xpath(groupLocator));
    }
}

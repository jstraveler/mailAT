package PageClasses;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;

public class UserPage extends BasePage implements Iterable {
    WebDriver driver;
    String GROUP_PATH = ".//a[@data-l=\"t,userAltGroup\"]";
    String MORE_PATH = ".//div[@data-l=\"t,toggler\"]";

    public UserPage(WebDriver driver) {
        super(driver);
    }

    protected void check() {

    }

    public GroupPage moveToGroups() {
        driver.findElement(By.xpath(GROUP_PATH)).click();
        return new GroupPage(driver);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
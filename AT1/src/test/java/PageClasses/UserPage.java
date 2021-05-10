package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;

public class UserPage implements Iterable{
    WebDriver driver;
    String GROUP_PATH = ".//a[@data-l=\"t,userAltGroup\"]";

    public UserPage(WebDriver driver){
        this.driver = driver;
        check();
    }

    protected void check(){

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
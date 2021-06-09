package PageClasses;

import BaseClasses.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.ArrayList;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.*;

public class MenuBar extends BasePage {
    WebDriver driver;
    // menu locators
    String profileMenu = ".//a[contains(@data-l,\"t,userPage\")]";
    String feedMenu = ".//a[contains(@data-l,\"t,userMain\")]";
    String discoveryMenu = ".//a[contains(@data-l,\"t,discovery\")]";
    String friendsMenu = ".//a[contains(@data-l,\"t,userFriend\")]";
    String photosMenu = ".//a[contains(@data-l,\"t,userPhotos\")]";
    String groupsMenu = ".//a[contains(@data-l,\"t,userAltGroup\")]";
    String gamesMenu = ".//a[contains(@data-l,\"t,appsShowcaseHD\")]";
    String giftsMenu = ".//a[contains(@data-l,\"t,giftsFront\")]";
    String mallMenu = ".//a[contains(@data-l,\"t,mall\")]";
    String storiesMenu = ".//a[contains(@data-l,\"dfOperation\")]";
    String mastersMenu = ".//a[contains(@data-l,\"t,pchela\")]";
    String notesMenu = ".//a[contains(@data-l,\"t,userStatuses\")]";
    String topphotosMenu = ".//a[contains(@data-l,\"t,photoWall\")]";
    String marathonsMenu = ".//a[contains(@data-l,\"t,challenges\")]";
    String paymentsMenu = ".//a[contains(@data-l,\"t,payments\")]";
    /*String moreMenu = ".//a[contains(@data-l,\"t,toggler\")]";
    String youlaMenu = ".//a[contains(@data-l,\"t,youlaAdverts\")]";
    String eventsMenu = ".//a[contains(@data-l,\"t,eventsCalendar\")]";
    String bookmarksMenu = ".//a[contains(@data-l,\"t,bookmarks\")]";
    String aboutMenu = ".//a[contains(@data-l,\"t,userProfile\")]";
    String auctionsMenu = ".//a[contains(@data-l,\"t,auctionsMain\")]";
    String servicesMenu = ".//a[contains(@data-l,\"t,bizApps\")]";
    String businessManagerMenu = ".//a[contains(@data-l,\"t,businessProfileCabinet\")]";
    String amMenu = ".//a[contains(@data-l,\"t,adsManagerMain\")]";
    String hideMenu = ".//div[contains(@data-l,\"t,toggler\")]";*/
    String expectedElementProfileMenu = ".//div[contains(@data-l,\"t,main-content-header\")]";
    String expectedElementFeedMenu = ".//div[contains(@data-l,\"t,filter\")]";
    String expectedElementDiscoveryMenu = ".//div[contains(@data-item-cls,\"filter\")]";
    String expectedElementFriendsMenu = ".//friend-search-input[contains(@class,\"friend-search-input\")]";
    String expectedElementPhotosMenu = ".//span[contains(@data-l,\"t,upload-new-photo\")]";
    String expectedElementGroupsMenu = ".//div[contains(@class,\"create-group\")]";
    String expectedElementGamesMenu = ".//div[contains(@class,\"games-filter-w-react\")]";
    String expectedElementGiftsMenu = ".//div[contains(@class,\"gifts-header_search-block hook\")]";
    String expectedElementMallMenu = ".//div[contains(@class,\"mall-menu_search_cnt\")]";
    String expectedElementStoriesMenu = ".//div[contains(@class,\"daily-photo-slider_upload-title ellip\")]";
    String expectedElementMastersMenu = ".//div[contains(@class,\"toolbar_logo_img\")]";
    String expectedElementNotesMenu = ".//div[contains(@class,\"stub-empty __statuses\")]";
    String expectedElementTopphotosMenu = ".//div[contains(@data-l,\"t,myCard\")]";
    String expectedElementMarathonsMenu = ".//a[contains(@data-l,\"t,create-new-challenge\")]";
    String expectedElementPaymentsMenu = ".//div[contains(@id,\"PaymentsServicesBlock\")]";
    public ArrayList<String> expectedElementLocators = new ArrayList<>();
    public ArrayList<String> menuLocators = new ArrayList<>();

    public MenuBar(WebDriver driver) {
        super(driver);
        this.driver = driver;
        initCollection();
        initCollection2();
    }

    public void checkMenu(String xpath, String url, String element) {
        driver.findElement(By.xpath(xpath)).click();
        new WebDriverWait(driver, 1).until(ExpectedConditions.urlContains(url));
        assertThat(driver.getCurrentUrl()).contains(url);
        new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(element))));
        assertTrue("Элемент не найден", driver.findElement(By.xpath(element)).isDisplayed());
        driver.get("https://ok.ru/feed");
        new WebDriverWait(driver, 1).until(ExpectedConditions.urlToBe("https://ok.ru/feed"));
    }

    // Collections with menu locators
    private void initCollection() {
        menuLocators.add(profileMenu);
        menuLocators.add(feedMenu);
        menuLocators.add(discoveryMenu);
        menuLocators.add(friendsMenu);
        menuLocators.add(photosMenu);
        menuLocators.add(groupsMenu);
        menuLocators.add(gamesMenu);
        menuLocators.add(giftsMenu);
        menuLocators.add(mallMenu);
        menuLocators.add(storiesMenu);
        menuLocators.add(mastersMenu);
        menuLocators.add(notesMenu);
        menuLocators.add(topphotosMenu);
        menuLocators.add(marathonsMenu);
        menuLocators.add(paymentsMenu);
        /*menuLocators.add(moreMenu);
        menuLocators.add(youlaMenu);
        menuLocators.add(eventsMenu);
        menuLocators.add(bookmarksMenu);
        menuLocators.add(aboutMenu);
        menuLocators.add(auctionsMenu);
        menuLocators.add(servicesMenu);
        menuLocators.add(businessManagerMenu);
        menuLocators.add(amMenu);
        menuLocators.add(hideMenu);*/
    }

    private void initCollection2() {
        expectedElementLocators.add(expectedElementProfileMenu);
        expectedElementLocators.add(expectedElementFeedMenu);
        expectedElementLocators.add(expectedElementDiscoveryMenu);
        expectedElementLocators.add(expectedElementFriendsMenu);
        expectedElementLocators.add(expectedElementPhotosMenu);
        expectedElementLocators.add(expectedElementGroupsMenu);
        expectedElementLocators.add(expectedElementGamesMenu);
        expectedElementLocators.add(expectedElementGiftsMenu);
        expectedElementLocators.add(expectedElementMallMenu);
        expectedElementLocators.add(expectedElementStoriesMenu);
        expectedElementLocators.add(expectedElementMastersMenu);
        expectedElementLocators.add(expectedElementNotesMenu);
        expectedElementLocators.add(expectedElementTopphotosMenu);
        expectedElementLocators.add(expectedElementMarathonsMenu);
        expectedElementLocators.add(expectedElementPaymentsMenu);
    }

    public int getMenusCount() {
        return menuLocators.size();
    }
}

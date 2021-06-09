package PageClasses;

import java.util.ArrayList;

public class SomeVariables {
    // groups category locators
    //.//input[contains(@id,"field_email")]
    static String newsCategory = ".//a[contains(@data-l,\"t,massmedia\")]";
    static String autoCategory = ".//a[contains(@data-l,\"t,automoto\")]";
    static String blogsCategory = ".//a[contains(@data-l,\"t,blogs\")]";
    static String familyCategory = ".//a[contains(@data-l,\"t,family\")]";
    static String designCategory = ".//a[contains(@data-l,\"t,design\")]";
    static String animalsCategory = ".//a[contains(@data-l,\"t,animals\")]";
    static String cookCategory = ".//a[contains(@data-l,\"t,cookery\")]";
    static String gameCategory = ".//a[contains(@data-l,\"t,games\")]";
    static String cinemaCategory = ".//a[contains(@data-l,\"t,cinema\")]";
    static String fashionCategory = ".//a[contains(@data-l,\"t,fashion\")]";
    static String sportCategory = ".//a[contains(@data-l,\"t,sport\")]";
    static String travelCategory = ".//a[contains(@data-l,\"t,travel\")]";
    static String educationCategory = ".//a[contains(@data-l,\"t,education\")]";
    static String computerCategory = ".//a[contains(@data-l,\"t,computer\")]";
    static String musicCategory = ".//a[contains(@data-l,\"t,music\")]";
    static String entertainmentCategory = ".//a[contains(@data-l,\"t,entertainment\")]";
    static String hobbyCategory = ".//a[contains(@data-l,\"t,hobby\")]";
    static String artCategory = ".//a[contains(@data-l,\"t,art\")]";
    static String charityCategory = ".//a[contains(@data-l,\"t,charity\")]";
    static String scienceCategory = ".//a[contains(@data-l,\"t,science\")]";
    static String philosophyCategory = ".//a[contains(@data-l,\"t,philosophy\")]";
    public static ArrayList<String> groupsCategoryLocators = new ArrayList<>();



    // Collection with groups category locators
    static {
        groupsCategoryLocators.add(newsCategory);
        groupsCategoryLocators.add(autoCategory);
        groupsCategoryLocators.add(blogsCategory);
        groupsCategoryLocators.add(familyCategory);
        groupsCategoryLocators.add(designCategory);
        groupsCategoryLocators.add(animalsCategory);
        groupsCategoryLocators.add(cookCategory);
        groupsCategoryLocators.add(gameCategory);
        groupsCategoryLocators.add(cinemaCategory);
        groupsCategoryLocators.add(fashionCategory);
        groupsCategoryLocators.add(sportCategory);
        groupsCategoryLocators.add(travelCategory);
        groupsCategoryLocators.add(educationCategory);
        groupsCategoryLocators.add(computerCategory);
        groupsCategoryLocators.add(musicCategory);
        groupsCategoryLocators.add(entertainmentCategory);
        groupsCategoryLocators.add(hobbyCategory);
        groupsCategoryLocators.add(artCategory);
        groupsCategoryLocators.add(charityCategory);
        groupsCategoryLocators.add(scienceCategory);
        groupsCategoryLocators.add(philosophyCategory);
    }

    // menu URL
    static String profileMenuURL = "profile"; //581511015639 - id
    static String feedMenuURL = "https://ok.ru/feed";
    static String discoveryMenuURL = "https://ok.ru/discovery";
    static String friendsMenuURL = "friends";
    static String photosMenuURL = "photos";
    static String groupsMenuURL = "groups";
    static String gamesMenuURL = "https://ok.ru/vitrine";
    static String giftsMenuURL = "https://ok.ru/gifts";
    static String mallMenuURL = "mall";
    static String storiesMenuURL = "https://ok.ru/feed"; // shadow dom
    static String mastersMenuURL = "https://ok.ru/masters";
    static String notesMenuURL = "statuses";
    static String topphotosMenuURL = "https://ok.ru/topphoto";
    static String marathonsMenuURL = "https://ok.ru/marathons";
    static String paymentsMenuURL = "https://ok.ru/payments";
    static String moreMenuURL = "https://ok.ru/feed"; // show more
    static String youlaMenuURL = "https://ok.ru/youla";
    static String eventsMenuURL = "https://ok.ru/events";
    static String bookmarksMenuURL = "https://ok.ru/bookmarks";
    static String aboutMenuURL = "about";
    static String auctionsMenuURL = "https://ok.ru/auctions";
    static String servicesMenuURL = "https://ok.ru/services";
    static String businessManagerMenuURL = "https://ok.ru/businessmanager";
    static String amMenuURL = "https://ok.ru/am";
    static String hideMenuURL = "https://ok.ru/feed"; // hide some
    public static ArrayList<String> menusURL = new ArrayList<>();

    // Collection with menu URL
    static {
        menusURL.add(profileMenuURL);
        menusURL.add(feedMenuURL);
        menusURL.add(discoveryMenuURL);
        menusURL.add(friendsMenuURL);
        menusURL.add(photosMenuURL);
        menusURL.add(groupsMenuURL);
        menusURL.add(gamesMenuURL);
        menusURL.add(giftsMenuURL);
        menusURL.add(mallMenuURL);
        menusURL.add(storiesMenuURL);
        menusURL.add(mastersMenuURL);
        menusURL.add(notesMenuURL);
        menusURL.add(topphotosMenuURL);
        menusURL.add(marathonsMenuURL);
        menusURL.add(paymentsMenuURL);
        menusURL.add(moreMenuURL);
        menusURL.add(youlaMenuURL);
        menusURL.add(eventsMenuURL);
        menusURL.add(bookmarksMenuURL);
        menusURL.add(aboutMenuURL);
        menusURL.add(auctionsMenuURL);
        menusURL.add(servicesMenuURL);
        menusURL.add(businessManagerMenuURL);
        menusURL.add(amMenuURL);
        menusURL.add(hideMenuURL);
    }


}

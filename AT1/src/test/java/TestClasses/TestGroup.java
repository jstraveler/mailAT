package TestClasses;

import BaseClasses.TestMain;
import PageClasses.GroupPage;

public class TestGroup extends TestMain {

    GroupPage groupPage;

    //@Before
    public void start() {
        setUp();
        get();
    }

    //@Test
    public void test() {
        new GroupPage(driver).checkCategory();
    }

    //@After
    public void stop() {
        tearDown();
    }


}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GroupTest extends MainTest {

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

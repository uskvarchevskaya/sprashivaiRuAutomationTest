import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.Steps;

/**
 * Created by PC on 15.01.2016.
 */
public class SparashivaiRuAutomationTest {

    private Steps steps;
    private final String USERNAME = "testProject";
    private final String PASSWORD = "testProject";

    @BeforeMethod(description = "Init browser")
    public void setUp(){
        steps = new Steps();
        steps.initBrowser();
    }

    @AfterMethod(description="Stop Browsser")
    public void stopBrowser(){
        steps.closeDriver();
    }

    @Test(description="Login to sprashivai.ru")
    public void oneCanLoginSprashivaiRu(){
        steps.loginSprashivaiRu(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn(USERNAME));
    }
}

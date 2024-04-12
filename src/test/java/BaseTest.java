import driverLaunge.DriverSetUp;
import functions.OverridingBaseMethods;
import functions.WaitersClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pagesForTesting.BasePage;
import pagesForTesting.FirstPageDniproMUA;
import pagesForTesting.SecondPageCordLessTool;
import pagesForTesting.ThirdPageTradingSalons;
import utils.MyAllureListener;

@Listeners(MyAllureListener.class)
public class BaseTest {
    protected WebDriver driver = DriverSetUp.startDriver();
    protected WaitersClass waitersClass = new WaitersClass(driver);
    protected OverridingBaseMethods overridingBaseMethods = new OverridingBaseMethods(driver);
    protected BasePage basePage = new BasePage(driver);
    protected FirstPageDniproMUA firstPageDniproMUA = new FirstPageDniproMUA(driver);
    protected SecondPageCordLessTool secondPageCordLessTool = new SecondPageCordLessTool(driver);
    protected ThirdPageTradingSalons thirdPageTradingSalons = new ThirdPageTradingSalons(driver);
    @BeforeSuite
    public void driverInitial(){
        driver=DriverSetUp.startDriver();
    }
    @AfterSuite
    public void stopDriver(){
        driver.quit();
    }
}

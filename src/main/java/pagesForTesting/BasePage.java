package pagesForTesting;

import functions.OverridingBaseMethods;
import functions.WaitersClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver){
        this.driver=driver;
        waitersClass=new WaitersClass(driver);
        overridingBaseMethods=new OverridingBaseMethods(driver);
        PageFactory.initElements(driver,this);
    }
    protected WebDriver driver;
    protected WaitersClass waitersClass;
    protected OverridingBaseMethods overridingBaseMethods;

}

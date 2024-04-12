package functions;

import org.openqa.selenium.WebDriver;
public class OverridingBaseMethods {
    private WebDriver driver;
    private WaitersClass waiter;

    public OverridingBaseMethods(WebDriver driver) {
        this.driver = driver;
        waiter=new WaitersClass(driver);
    }
}

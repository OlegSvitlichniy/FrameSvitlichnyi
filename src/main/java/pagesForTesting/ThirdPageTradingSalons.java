package pagesForTesting;

import constances.ConstantUrls;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class ThirdPageTradingSalons extends BasePage{
    public ThirdPageTradingSalons(WebDriver driver) {
        super(driver);
    }
    public ThirdPageTradingSalons openThirdPageTradingSalons (){
        driver.get(ConstantUrls.ThirdPage_Trading_Salons);
        Actions moveMouse = new Actions(driver);
        moveMouse.moveByOffset(0,0).perform();
        return this;
    }
    public ThirdPageTradingSalons methodForGoModelWindow() {
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return this;
    }
    /*Тест кейс 1*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[4]/div/ul/li[1]/button")
    private WebElement buttonChangeCitySalon;
    @FindBy(xpath = "//*[@id=\"vueContainer\"]/div[3]/div/div/div/div[2]/div/div[2]/ul/li[12]/button")
    private WebElement buttonChangeCitySalonPoltava;
    public ThirdPageTradingSalons clickButtonChangeCitySalon(){
        buttonChangeCitySalon.click();
        return this;
    }
    public ThirdPageTradingSalons clickButtonChangeCitySalonPoltava(){
        waitersClass.waitForVisibilityOfElement(buttonChangeCitySalonPoltava);
        buttonChangeCitySalonPoltava.click();
        return this;
    }
    /*Тест-кейс 2*/
    @FindBy(xpath = "//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/div")
    private WebElement ButtonshopCity;
    public ThirdPageTradingSalons clickButtonCityShop(){
        ButtonshopCity.click();
        return this;
    }
    public ThirdPageTradingSalons scrollPageDown(){
        JavascriptExecutor shopsCity = (JavascriptExecutor) driver;
        shopsCity.executeScript("window.scrollBy(0, 200)");
        waitersClass.waitForVisibilityOfElement(ButtonshopCity);
        return this;
    }
    @FindBy(xpath = "//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul/li[1]/div/div[2]/div[1]/div[1]/div")
    private WebElement ButtonJobTime;
    public ThirdPageTradingSalons clickButtonJobTime(){
        ButtonJobTime.click();
        return this;
    }
}

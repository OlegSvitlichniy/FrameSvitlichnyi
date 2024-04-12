package pagesForTesting;

import constances.ConstantUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static constances.ConstantUrls.CordlessScrewdriverPage;
public class SecondPageCordLessTool extends BasePage {
    public SecondPageCordLessTool(WebDriver driver) {super(driver);}
    public SecondPageCordLessTool openSecondPageCordLessTool(){
        driver.get(ConstantUrls.SecongPage_Cordless_Tool);
        Actions moveMouse = new Actions(driver);
        moveMouse.moveByOffset(0,0).perform();
        return this;
    }
    /*Тест кейс 1*/
  @FindBy(xpath = "//*[@id=\"vuePages\"]/div[2]/div[1]/ul/li[4]/a")
    private WebElement ButtonCordlessScrewdriver;
  public SecondPageCordLessTool clickButtonCordlessScrewdriver(){
      waitersClass.waitForVisibilityOfElement(ButtonCordlessScrewdriver);
      ButtonCordlessScrewdriver.click();
      return this;
  }
  /*Тест-кейс 2*/
    public SecondPageCordLessTool openCordlessScrewdriverPage(){
        driver.get(CordlessScrewdriverPage);
        return this;
    }
    @FindBy(xpath = "//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[1]/a/p")
    private WebElement ButtonSmallCardScrewdriverDnipro_MCD_12CXCompact;
    public SecondPageCordLessTool clickButtonSmallCardScrewdriverDnipro_MCD_12CXCompact(){
        ButtonSmallCardScrewdriverDnipro_MCD_12CXCompact.click();
        return this;
    }
    /*Тест-кейс 3*/
    @FindBy(xpath = "//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[3]/div/button")
    private WebElement ButtonBuyScrewdriverDnipro_MCD_12CXCompactOnSmallCard;

    public SecondPageCordLessTool hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact(){
        Actions action = new Actions(driver);
        action.moveToElement(ButtonSmallCardScrewdriverDnipro_MCD_12CXCompact).perform();
        return this;
    }
    public SecondPageCordLessTool clickButtonBuyScrewdriverDnipro_MCD_12CXCompactOnSmallCar(){
        waitersClass.waitForVisibilityOfElement(ButtonBuyScrewdriverDnipro_MCD_12CXCompactOnSmallCard);
        ButtonBuyScrewdriverDnipro_MCD_12CXCompactOnSmallCard.click();
        return this;
    }
    /*Тест-кейс 4*/
    @FindBy(xpath = "//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[3]/button[1]")
    private WebElement ButtonForAddToWishList;
    public SecondPageCordLessTool clickButtonForAddToWishList(){
        waitersClass.waitForVisibilityOfElement(ButtonForAddToWishList);
        ButtonForAddToWishList.click();
        return this;
    }
    /*Тест-кейс 5*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[5]/div[1]/div/div/div[2]/div/div[1]/button")
    private WebElement ButtonContinueShopping;
    public SecondPageCordLessTool clickButtonContinueShopping(){
        waitersClass.waitForVisibilityOfElement(ButtonContinueShopping);
        ButtonContinueShopping.click();
        return this;
    }

}

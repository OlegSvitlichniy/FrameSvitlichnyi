package pagesForTesting;

import constances.ConstantUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static constances.ConstantStringValues.textForInterToSearchField;
public class FirstPageDniproMUA extends BasePage {
    public FirstPageDniproMUA(WebDriver driver) {
        super(driver);
    }
    /*=========================================================================================================*/
    /*Тест-кейс 1*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[2]/div/form/input")
    private WebElement SearchField;
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[2]/div[2]/form/button[1]")
    private WebElement ButtonMagnifyingGlass;
    public FirstPageDniproMUA openFirstPageDnipro_M() {
        driver.get(ConstantUrls.FirstPage_DNIPRO_M_UA);
        Actions moveMouse = new Actions(driver);
        moveMouse.moveByOffset(0,0).perform();
        return this;
    }
    public FirstPageDniproMUA searchFieldenter() {
        SearchField.sendKeys(textForInterToSearchField);
        return this;
    }
    public FirstPageDniproMUA clickButtonGlass() {
        ButtonMagnifyingGlass.click();
        return this;
    }
    /*=======================================================================================================*/
    /*Тест-кейс 2*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[4]/div/ul/li[1]/button")
    private WebElement ButtonCity;
    @FindBy(xpath = "/html/body/div[2]/div[6]/div[3]/div/div/div/div[2]/div/div[2]/ul/li[5]/button")
    private WebElement ButtonCityInModalWeb;

    public FirstPageDniproMUA clickToChangeTheCity() {
        ButtonCity.click();
        return this;
    }
    /*=========================================================================================================*/
    /*Тест-кейс 3*/
    @FindBy(xpath = "//*[@id=\"vueContainer\"]/div[6]/button")
    private WebElement BubbleChatButton;
    public FirstPageDniproMUA clickBubbleChatButton(){
        BubbleChatButton.click();
        return this;
    }
    public FirstPageDniproMUA methodForGoModelWindow() {
        String mainWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return this;
    }
    /*=========================================================================================================*/
    /*Тест-кейс 4*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[4]/div/ul/li[3]/div[1]")
    private WebElement dropDawnLanguage;
    @FindBy(xpath = "//*[@id=\"header\"]/div[4]/div/ul/li[3]/div[2]/a")
    private WebElement dropDawnChangeLanguage;
    public FirstPageDniproMUA clickdropDawnLanguage(){
        dropDawnLanguage.click();
        return this;
    }
    public FirstPageDniproMUA clickdropDawnChangeLanguage(){
        waitersClass.waitForVisibilityOfElement(dropDawnChangeLanguage);
        dropDawnChangeLanguage.click();
        return this;
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div[4]/div/ul/li[3]/div[2]/a")
    private WebElement ButtonLangBack;
    public FirstPageDniproMUA clickButtonLangBack(){
        waitersClass.waitForVisibilityOfElement(ButtonLangBack);
        ButtonLangBack.click();
        return this;
    }
    /*=========================================================================================================*/
    /*Тест-кейс 5*/
    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[1]/div/div/div/div/ul/li[2]/a")
    private WebElement insideBarCategory ;
    public FirstPageDniproMUA clickinsideBarCategory(){
        insideBarCategory.click();
        return this;
    }
}



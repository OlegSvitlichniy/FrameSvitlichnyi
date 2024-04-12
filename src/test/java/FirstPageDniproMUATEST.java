import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constances.ConstantStringValues.*;
import static constances.ConstantUrls.CordLessTool_TC_5;
import static constances.ConstantUrls.FirstPage_DNIPRO_M_RU;
public class FirstPageDniproMUATEST extends BaseTest{
    @Test
    public void firstPageDniproMUA_test_case_1(){
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .searchFieldenter()
                .clickButtonGlass();
        String searchPageTitle = String.valueOf(driver.findElement(By.className("search-page__title-keyword")).getText());
        Assert.assertEquals(searchPageTitle,"\""+textForInterToSearchField+"\"");
    }
    @Test
    public void firstPageDniproMUA_test_case_2()  {
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickToChangeTheCity();
        WebElement elementCity = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[3]/div/div/div/div[2]/div"));
        Assert.assertTrue(elementCity.isDisplayed());
    }
   @Test
    public void firstPageDniproMUA_test_case_3(){
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickBubbleChatButton();
        WebElement bubble = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[6]/ul"));
        Assert.assertTrue(bubble.isDisplayed());
        firstPageDniproMUA.methodForGoModelWindow();
        WebElement bubbleChat = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[6]/ul/li[1]/a"));
        Assert.assertTrue(bubbleChat.isDisplayed());
    }

    @Test
    public void firstPageDniproMUA_test_case_4(){
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickinsideBarCategory();
        String URL_TC5 = driver.getCurrentUrl();
        Assert.assertEquals(URL_TC5,CordLessTool_TC_5);
        String headTitle = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[1]/div[1]")).getText());
        Assert.assertEquals(headTitle,textForAssert_Page_1_TC_5);
    }
    @Test
    public void firstPageDniproMUA_test_case_5() throws InterruptedException {
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickdropDawnLanguage()
                .clickdropDawnChangeLanguage();
        Thread.sleep(1000);
        String URL_Page_1_TC4 = driver.getCurrentUrl();
        Assert.assertEquals(URL_Page_1_TC4,FirstPage_DNIPRO_M_RU);
        firstPageDniproMUA
                .clickdropDawnLanguage()
                .clickdropDawnChangeLanguage()
                .clickButtonLangBack();
    }
}

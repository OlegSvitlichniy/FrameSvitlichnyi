
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static constances.ConstantStringValues.*;
import static constances.ConstantUrls.CordlessScrewdriverPage;

public class SecondPageCordLessToolTEST extends BaseTest {
     @Test
     public void secondPageCordLessToll_test_case_1(){
         secondPageCordLessTool
                 .openSecondPageCordLessTool();
         secondPageCordLessTool
                 .clickButtonCordlessScrewdriver();
         String secondPageTitleAssert = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[1]/h1")).getText());
         Assert.assertEquals(secondPageTitleAssert,textForAssert_Page_2_TC_1.toUpperCase());
         String URL_Page2_TC_1 = driver.getCurrentUrl();
         Assert.assertEquals(URL_Page2_TC_1,CordlessScrewdriverPage);
     }
    @Test
    public void secondPageCordLessToll_test_case_2(){
        secondPageCordLessTool
                .openCordlessScrewdriverPage();
        String smallCardName = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[1]/a/p")).getText());
        String smallCardPrice = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[2]")).getText());
        secondPageCordLessTool
                .clickButtonSmallCardScrewdriverDnipro_MCD_12CXCompact();
        String OnPageCardName = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div[3]/div[1]/div/h1")).getText());
        String OnPageCardPrice = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[4]/div[1]/div")).getText());
        Assert.assertEquals(smallCardPrice,OnPageCardPrice);
        Assert.assertEquals(smallCardName,OnPageCardName);
    }
    @Test
    public void secondPageCordLessToll_test_case_3() {
        secondPageCordLessTool
                .openCordlessScrewdriverPage()
                .hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact();
        WebElement buttonBuy = driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[3]/div/button"));
        Assert.assertTrue(buttonBuy.isDisplayed());
    }
    @Test
    public void secondPageCordLessToll_test_case_4() {
        secondPageCordLessTool
                .openCordlessScrewdriverPage()
                .hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact()
                .clickButtonForAddToWishList();
        WebElement s = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[4]/div/div/div/div[2]/div"));
        Assert.assertTrue(s.isDisplayed(), "Element is not displayed");
        }
      @Test
    public void secondPageCordLessToll_test_case_5(){
          secondPageCordLessTool
                  .openCordlessScrewdriverPage()
                  .hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact()
                  .clickButtonBuyScrewdriverDnipro_MCD_12CXCompactOnSmallCar()
                  .clickButtonContinueShopping();
          WebElement elementTC_2_5 = driver.findElement(By.xpath("//*[@id=\"header\"]/div[5]/div[1]/div"));
          Assert.assertTrue(elementTC_2_5.isEnabled());
      }
    }


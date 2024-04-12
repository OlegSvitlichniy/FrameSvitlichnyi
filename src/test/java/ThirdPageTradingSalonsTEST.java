import constances.ConstantStringValues;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdPageTradingSalonsTEST  extends BaseTest{
    @Test
    public void thirdPageTradingSalons_test_case_1 () throws InterruptedException {
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .clickButtonChangeCitySalon()
                .methodForGoModelWindow()
                .clickButtonChangeCitySalonPoltava();
        Thread.sleep(3000);
        String stringCity = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]")).getText());
        Assert.assertEquals(stringCity, ConstantStringValues.getTextForAssert_Page_3_TC_);

    }
    @Test
    public void  thirdPageTradingSalons_test_case_2() throws InterruptedException {
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown();
        WebElement elementShop = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]"));
        Assert.assertTrue(elementShop.isDisplayed());
    }
    @Test
    public void thirdPageTradingSalons_test_case_3(){
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown()
                .clickButtonCityShop();
        WebElement elementShopKiev = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul"));
        Assert.assertTrue(elementShopKiev.isDisplayed());
    }
    @Test
    public void thirdPageTradingSalons_test_case_4(){
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown()
                .clickButtonCityShop();
        WebElement elementMap = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul/li[1]/div/div[2]/div[2]/a"));
        Assert.assertTrue(elementMap.isDisplayed());

    }
    @Test
    public void thirdPageTradingSalons_test_case_5(){
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown()
                .clickButtonCityShop()
                .clickButtonJobTime();
        WebElement elementTimeJob = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul/li[1]/div/div[2]/div[1]/div[1]/div/div/div/span[2]"));
        Assert.assertTrue(elementTimeJob.isDisplayed());
    }
}

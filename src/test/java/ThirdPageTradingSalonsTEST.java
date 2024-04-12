import constances.ConstantStringValues;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdPageTradingSalonsTEST  extends BaseTest{
    @Test
    /*Сторінка Салони
Місцезнаходження автоматично змінюється на сторінці після зміни в хедері.
Степи.
1. Відкрити меню Міста в Хедері.
2. Обрати будь-яке місто Полтава.
Експектед: Обране місто в хедері тепер відображається в колонці Моє місце знаходження та є першим в списку карток міст
*/
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
    /*ТС.2
На сторінці знаходиться список з салонами по міста.
Степи:
1. Відкрити сторінку з салонами
2. Проскролити сторінку вниз
Експктед: Контейнер з містами знаходиться на сторінці*/
    public void  thirdPageTradingSalons_test_case_2() throws InterruptedException {
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown();
        WebElement elementShop = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]"));
        Assert.assertTrue(elementShop.isDisplayed());
    }
    @Test
    /*ТС.3
Користувач може відкрити список магазинів у певному місті
Степи:
1. Відкрити сторінку з салонами
2. Проскролити сторінку вниз
3. Клікнути на кнопку Київ
Експектед: Відкрився список магазинів у місті Київ*/
    public void thirdPageTradingSalons_test_case_3(){
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown()
                .clickButtonCityShop();
        WebElement elementShopKiev = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul"));
        Assert.assertTrue(elementShopKiev.isDisplayed());
    }
    @Test
    /*ТС.4
Користувач може скористуватись функцією прокласти маршрут до обраного салону.
Степи:
1. Відкрити сторінку з салонами
2. Проскролити сторінку вниз
3. Клікнути на кнопку Київ
Експектед: Відкрився список магазинів у місті Київ. Кнопка "Прокласти маршрут" присутня на сторінці*/
    public void thirdPageTradingSalons_test_case_4(){
        thirdPageTradingSalons
                .openThirdPageTradingSalons()
                .scrollPageDown()
                .clickButtonCityShop();
        WebElement elementMap = driver.findElement(By.xpath("//*[@id=\"vueCart\"]/div/div[4]/ul/li[2]/ul/li[1]/div/div[2]/div[2]/a"));
        Assert.assertTrue(elementMap.isDisplayed());

    }
    @Test
    /*TC.5
Користувач може розгорнути список з робочими годинами на тиждень.
Степи:
1. Розгорнути робочі години дроп даун.
Експектед: Список з робочими годинами відкритий*/
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

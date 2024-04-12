import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static constances.ConstantStringValues.*;
import static constances.ConstantUrls.CordLessTool_TC_5;
import static constances.ConstantUrls.FirstPage_DNIPRO_M_RU;
public class FirstPageDniproMUATEST extends BaseTest{
    @Test
    /*TC.1
-----------
Знайти картку товара [імʼя товара] з головної сторінки(Тайтл)
Степи:
1. відкрити головну сторінку
2. Ввести назву товару в поле для сьорчу
3. Настинути лупу
Експектед резалт:  Поле “Результати за запитом:  [назва товару]”
*/
    public void firstPageDniproMUA_test_case_1(){
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .searchFieldenter()
                .clickButtonGlass();
        String searchPageTitle = String.valueOf(driver.findElement(By.className("search-page__title-keyword")).getText());
        Assert.assertEquals(searchPageTitle,"\""+textForInterToSearchField+"\"");
    }
    @Test
    /*TC.2
-----------
Користувач може змінити місто.
Степи:
1.  Клікнути на місто в хедері
Експектед: Вікно з списком міст відкрилося*/
    public void firstPageDniproMUA_test_case_2()  {
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickToChangeTheCity();
        WebElement elementCity = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[3]/div/div/div/div[2]/div"));
        Assert.assertTrue(elementCity.isDisplayed());
    }
   @Test
   /*ТС.3
-----------
Користувач може відкрити список доступних месенджерів. В списку доступних методів присутня кнопка чату з Менеджером Дніпро М
Степи:
1. Клікнути на чат бульбашку в правому нижньому кутку
Експектед резалт:
1. Відкрився список з доступними месенджерами магазину
2. В списку присутня кнопка чату з Менеджером Дніпро М*/
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
    /*ТС.4
-----------
Користувач може перейти на будь-яку категорію
Степи:
Клікнути на категорію в лівому боковому меню
Експектед: Обрана категорія відкрилась (перевірити, що змінилась url, Рейн тайтл на сторінці відповідає назві відкритої категорії)
*/
    public void firstPageDniproMUA_test_case_4(){
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickinsideBarCategory();
        String URL_TC5 = driver.getCurrentUrl();
        Assert.assertEquals(URL_TC5,CordLessTool_TC_5);
        String headTitle = String.valueOf(driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[1]/div[1]")).getText());
        Assert.assertEquals(headTitle,textForAssert_Page_1_TC_4);
    }
    @Test
    /*ТС.5
-----------
Користувач може змінити мову на сайті
Степи:
1. Відкрити дроп даун з мовами
2. Клікнути на будь-яку іншу мову
Експектед: -Мова сторінки змінена на обрану (URL змінився на відповідну мову)*/
    public void firstPageDniproMUA_test_case_5() throws InterruptedException {
        firstPageDniproMUA
                .openFirstPageDnipro_M()
                .clickdropDawnLanguage()
                .clickdropDawnChangeLanguage();
        Thread.sleep(1000);
        String URL_Page_1_TC5 = driver.getCurrentUrl();
        Assert.assertEquals(URL_Page_1_TC5,FirstPage_DNIPRO_M_RU);
        firstPageDniproMUA
                .clickdropDawnLanguage()
                .clickdropDawnChangeLanguage()
                .clickButtonLangBack();
    }
}

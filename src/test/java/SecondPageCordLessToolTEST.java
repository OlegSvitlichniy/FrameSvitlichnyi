
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static constances.ConstantStringValues.*;
import static constances.ConstantUrls.CordlessScrewdriverPage;

public class SecondPageCordLessToolTEST extends BaseTest {
     @Test
     /*ТС.1
-----------
1,Користувач має змогу перейти на розділ з інструментами
Степи:
Клікнути на назву розділу(наприклад Акумуляторні шуруповерти)
Експектед: Обраний підрозділ відкрився ( для тесту перевірити url, та тайтл)
*/
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
    /*ТС.2
-----------
2,Користувач може відкрити карточку товару.
Прекондішн: Користувач залогінен/Користувач не залогінен, Користувач знаходиться на конкретній сторінці з інструментами(наприклад Акумуляторні шуруповерти).
Степи:
Клікнути на будь-яку карточку товару.
Експектед: Карточка товару відкрилась і відповідає назві та ціні*/
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
    /*ТС.3
-----------
Кнопка “Кошик” присутня в карточці товару.
Прекондішн: Користувач не залогінен, Користувач знаходиться на конкретній сторінці з інструментами(наприклад Акумуляторні шуруповерти). Степи: 1. Навести на товар (наприклад назва товару)
Експектед: Кнопка “Кошик” присутня.*/
    public void secondPageCordLessToll_test_case_3() {
        secondPageCordLessTool
                .openCordlessScrewdriverPage()
                .hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact();
        WebElement buttonBuy = driver.findElement(By.xpath("//*[@id=\"vuePages\"]/div[2]/div[4]/div/ul/li[1]/div/div/div/div[3]/div/button"));
        Assert.assertTrue(buttonBuy.isDisplayed());
    }
    @Test
    /*TC.4
-----------
Не залогінений користувач не може додати товар в обране. Прекондішн: Користувач не залогінен, Користувач знаходиться на конкретній сторінці з інструментами(наприклад Акумуляторні шуруповерти).
Степи:
1. Навести на товар (наприклад назва товару)
2. Клікнути на кнопку "Додати до обраного".
Експектед: Відкрилась форма “Реєстрації
*/
    public void secondPageCordLessToll_test_case_4() {
        secondPageCordLessTool
                .openCordlessScrewdriverPage()
                .hoverToSmallCardScrewdriverDnipro_MCD_12CXCompact()
                .clickButtonForAddToWishList();
        WebElement s = driver.findElement(By.xpath("//*[@id=\"vueContainer\"]/div[4]/div/div/div/div[2]/div"));
        Assert.assertTrue(s.isDisplayed(), "Element is not displayed");
        }
      @Test
      /*ТС.5
-----------
Користувач може продовжити покупки.
Перкондішн: Користувач залогінен/Користувач не залогінен, Користувач вже знайшов та додав в кошик товар, Модальне вікно “Кошик” Відкрите.
Степи:
1. Клікнути на лінку “Продовжити покупки”
Експектед:  Модальне вікно “Кошик” закрито, Користувач на сторінці товарів*/
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


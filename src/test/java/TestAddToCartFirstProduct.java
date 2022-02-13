import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class TestAddToCartFirstProduct {

    final String EXPECTED = "1";

    @BeforeClass
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
    public void testAddToCartProduct() {
        new MainPageLogic().clickCategoryBtn()
                .clickNotebookBtn()
                .addToCartFirstProduct();

        String titleOnPage = new SearchPageLogic().checkTitleOnSearchPage();

        CartLogic cartLogic = new CartLogic();

        assertEquals(cartLogic.checkOneProductInCart(), EXPECTED);

        cartLogic.clickOnProductInCart();

        assertEquals(cartLogic.checkProductTitleInCart(), titleOnPage);

    }


}

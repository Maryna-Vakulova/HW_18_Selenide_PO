import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAddToCartFirstProduct {
    WebDriver driver;
    WebDriverWait wait;
    String expectedResult = "1";

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void testAddToCartProduct() {

        new MainPageLogic(driver, wait).clickCategoryBtn()
                .clickNotebookBtn()
                .addToCartFirstProduct();

        String titleOnPage = new SearchPageLogic(driver, wait).checkTitleOnSearchPage();

        CartLogic cartLogic = new CartLogic(driver, wait);

        Assert.assertEquals(cartLogic.checkOneProductInCart(), expectedResult);
        cartLogic.clickOnProductInCart();

        Assert.assertEquals(cartLogic.checkProductTitleInCart(), titleOnPage);
    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}

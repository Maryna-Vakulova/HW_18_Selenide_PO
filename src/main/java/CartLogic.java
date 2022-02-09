import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartLogic {

    By btnCartCheckProduct = By.xpath("//button[contains(@class,'header__button--active')]");
    By titleOfProductInCart = By.xpath("//a[@class='cart-product__title']");

    private WebDriver driver;
    private WebDriverWait wait;

    public CartLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public CartLogic clickOnProductInCart() {
        driver.findElement(btnCartCheckProduct).click();
        return this;
    }

    public String checkProductTitleInCart() {
        return driver.findElement(titleOfProductInCart).
                getAttribute("outerText");
    }

    public String checkOneProductInCart() {
        return driver.findElement(btnCartCheckProduct).
                getAttribute("innerText");
    }


}

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartElement {
    SelenideElement btnCartCheckProduct = $(By.xpath("//button[contains(@class,'header__button--active')]"));
    SelenideElement titleOfProductInCart = $(By.xpath("//a[@class='cart-product__title']"));
}

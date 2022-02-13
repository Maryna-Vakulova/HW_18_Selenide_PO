import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CartLogic extends CartElement {

    public CartLogic clickOnProductInCart() {
        btnCartCheckProduct.click();
        return this;
    }

    public String checkProductTitleInCart() {
        return titleOfProductInCart.shouldBe(Condition.visible).
                attr("outerText");
    }

    public String checkOneProductInCart() {
        return btnCartCheckProduct.shouldBe(Condition.visible).
                attr("innerText");
    }
}

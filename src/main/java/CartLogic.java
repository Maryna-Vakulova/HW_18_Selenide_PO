import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CartLogic extends CartElement {

    public CartLogic clickOnProductInCart(SelenideElement button) {
        button.shouldBe(Condition.visible).click();
        return this;
    }

    public String checkProductTitleInCart(SelenideElement title) {
        return title.shouldBe(Condition.visible).
                attr("outerText");
    }

    public String checkOneProductInCart(SelenideElement button) {
        return button.shouldBe(Condition.visible).
                attr("innerText");
    }
}

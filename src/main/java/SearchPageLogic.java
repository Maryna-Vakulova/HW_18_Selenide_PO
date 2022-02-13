import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class SearchPageLogic extends SearchPageElement{


    public SearchPageLogic addToCartFirstProduct(SelenideElement product) {
        product.shouldBe(Condition.visible).click();
        return this;
    }

    public String checkTitleOnSearchPage() {
        return titleOfFirstProduct.attr("outerText");
    }

}

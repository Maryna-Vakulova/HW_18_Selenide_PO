import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class SearchPageLogic extends SearchPageElement{


    public SearchPageLogic addToCartFirstProduct() {
        firstProductOnPage.shouldBe(Condition.visible).click();
        return this;
    }

    public String checkTitleOnSearchPage() {
        return titleOfFirstProduct.attr("outerText");
    }

}

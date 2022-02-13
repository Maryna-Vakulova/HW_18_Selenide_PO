import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic extends MainPageElement {

    public CategoryPageLogic clickCategoryBtn(SelenideElement category) {
        category.shouldBe(Condition.visible).click();
        return page(CategoryPageLogic.class);
    }
}

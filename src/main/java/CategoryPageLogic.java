import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageElement{

    public SearchPageLogic clickNotebookBtn() {
        choiceCategoryNotebook.shouldBe(Condition.visible).click();
        return page(SearchPageLogic.class);
    }
}

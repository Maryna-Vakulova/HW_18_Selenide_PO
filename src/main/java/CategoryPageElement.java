import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPageElement {

    SelenideElement categoryNotebook = $(By.xpath("//div[@class='tile-cats']"));
}

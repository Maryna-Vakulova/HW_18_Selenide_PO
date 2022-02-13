import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPageElement {

    SelenideElement firstProductOnPage = $(By.xpath("//button[contains(@class,'buy-button')]"));
    SelenideElement titleOfFirstProduct = $(By.xpath("//span[@class='goods-tile__title']"));
}

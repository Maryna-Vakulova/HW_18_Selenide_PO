import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLogic {

    By firstProductOnPage = By.xpath("//button[contains(@class,'buy-button')]");
    By titleOfFirstProduct = By.xpath("//span[@class='goods-tile__title']");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLogic(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLogic addToCartFirstProduct() {
        driver.findElement(firstProductOnPage).click();
        return this;
    }

    public String checkTitleOnSearchPage() {
        return driver.findElement(titleOfFirstProduct).
                getAttribute("outerText");
    }

}

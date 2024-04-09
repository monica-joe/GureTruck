package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="[data-cel-widget='search_result_1']")
    public WebElement productCard;

    @FindBy(id ="add-to-cart-button")
    public WebElement addToCartButton;

    public void addProductToCart() {
        clickElement(productCard);
        clickElement(addToCartButton);
    }
}

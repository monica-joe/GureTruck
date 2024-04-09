package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="twotabsearchtextbox")
    public WebElement searchForProductInput;

    @FindBy(id ="nav-search-submit-button")
    public WebElement searchSubmitButton;

    @FindBy(id ="NATC_SMART_WAGON_CONF_MSG_SUCCESS")
    public WebElement productAddedSuccessMessage;

    @FindBy(id ="nav-cart-count-container")
    public WebElement cartCount;

    public void searchForProduct(String text) {
        enterText(searchForProductInput, text);
        clickElement(searchSubmitButton);
    }

}

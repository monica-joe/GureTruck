package Steps;

import Pages.HomePage;
import Pages.ProductPage;
import Tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToCart extends TestBase {

   HomePage HomePageObj;
   ProductPage ProductPageObj;
   String productName= "makeup";

    @When("^Search for a product$")
    public void Search_for_a_product() {
        HomePageObj = new HomePage(driver);
        System.out.println("------site launched------");
        HomePageObj.searchForProduct(productName);
        // Get the current URL of the webpage
        String currentUrl = driver.getCurrentUrl();
        // Assert that the URL contains the text
        Assert.assertTrue(currentUrl.contains(productName));
    }

    @And("^Add the product to cart$")
    public void Add_the_product_to_cart() {
        ProductPageObj = new ProductPage(driver);
        ProductPageObj.addProductToCart();
        System.out.println("------added the product------");
    }

    @And("^Verify the product is added to cart successfully$")
    public void Verify_the_product_is_added_to_cart_successfully()  {
        Assert.assertTrue(HomePageObj.productAddedSuccessMessage.getText().contains("Added to Cart"));
        Assert.assertEquals(HomePageObj.cartCount.getText(), "1");
    }

}

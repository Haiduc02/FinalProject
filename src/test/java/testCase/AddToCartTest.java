package testCase;

import Pages.AddToCartPage;
import Pages.BasePage;
import Pages.SearchFieldPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest extends BasePage {
    private AddToCartPage AddToCartPage;

            @BeforeMethod
    public void setup() {
                super.setUp();
                AddToCartPage = new AddToCartPage(driver);
            }

            @Test
    public void clickOnCartButton () throws InterruptedException{
                AddToCartPage.clickOnAwesomeMetalChair();
                AddToCartPage.addToCart();
            }
}

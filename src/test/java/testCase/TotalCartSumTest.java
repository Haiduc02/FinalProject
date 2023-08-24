package testCase;

import Pages.BasePage;
import Pages.TotalCartSumPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TotalCartSumTest extends BasePage {
    private TotalCartSumPage TotalCartSumPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        TotalCartSumPage = new TotalCartSumPage(driver);
    }

    @Test
    public void sumOfCart () throws InterruptedException{
        TotalCartSumPage.clickOnProduct();
        TotalCartSumPage.addProductInCart();
        TotalCartSumPage.addSecondProduct();
        TotalCartSumPage.openCart();
        TotalCartSumPage.getTotalInCart();

    }

}

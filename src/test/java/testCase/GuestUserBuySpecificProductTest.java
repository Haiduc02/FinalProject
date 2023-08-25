package testCase;

import Pages.BasePage;
import Pages.GuestUserBuySpecificProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GuestUserBuySpecificProductTest extends BasePage {
    private GuestUserBuySpecificProductPage GuestUserBuySpecificProductPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        GuestUserBuySpecificProductPage = new GuestUserBuySpecificProductPage(driver);
    }

    @Test
    public void specificProduct () throws InterruptedException{
        GuestUserBuySpecificProductPage.metalMouse();
        GuestUserBuySpecificProductPage.searchMouse();
        GuestUserBuySpecificProductPage.enterSearch();
        GuestUserBuySpecificProductPage.accessProduct();
        GuestUserBuySpecificProductPage.productInCart();
        GuestUserBuySpecificProductPage.viewCart();
    }
}

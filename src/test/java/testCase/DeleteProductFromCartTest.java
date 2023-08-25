package testCase;

import Pages.BasePage;
import Pages.DeleteProductFromCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteProductFromCartTest extends BasePage {
    private DeleteProductFromCartPage DeleteProductFromCartPage;

    @BeforeMethod
    public void setup(){
     super.setUp();
        DeleteProductFromCartPage = new DeleteProductFromCartPage(driver);
    }

    @Test
    public void deleteProduct () throws InterruptedException{
        DeleteProductFromCartPage.addFirstProduct();
        DeleteProductFromCartPage.addSecondProduct();
        DeleteProductFromCartPage.cartPage();
        DeleteProductFromCartPage.clickOnTrashButton();
    }
}

package testCase;

import Pages.AddCombinationWorldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddCombinationWorldTest extends BasePage {

    private AddCombinationWorldPage AddCombinationWorldPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        AddCombinationWorldPage = new AddCombinationWorldPage(driver);
    }
    @Test
    public void enterTextInField () throws InterruptedException{
        AddCombinationWorldPage.enterText();
        AddCombinationWorldPage.searchText();
        AddCombinationWorldPage.submit();
    }
}

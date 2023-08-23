package testCase;

import Pages.AddTextInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddTextInSearchFieldTest extends BasePage {

    private AddTextInSearchFieldPage AddTextInSearchFieldPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        AddTextInSearchFieldPage = new AddTextInSearchFieldPage(driver);
    }

    @Test
    public void clickOnSearchField() throws InterruptedException{
        AddTextInSearchFieldPage.clickOnSearchBar();

    }
}

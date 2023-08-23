package testCase;

import Pages.BasePage;
import Pages.SearchFieldPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchFieldTest extends BasePage {

    private SearchFieldPage SearchFieldPage;


    @BeforeMethod
    public void setup() {
        super.setUp();
        SearchFieldPage = new SearchFieldPage(driver);
    }


    @Test

    public void clickOnSearchField() throws InterruptedException{
        SearchFieldPage.clickOnSearchField();
    }
}

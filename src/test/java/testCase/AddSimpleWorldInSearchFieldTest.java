package testCase;

import Pages.AddNumbersInSearchFieldPage;
import Pages.AddSimpleWorldInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddSimpleWorldInSearchFieldTest extends BasePage {
    private AddSimpleWorldInSearchFieldPage AddSimpleWorldInSearchFieldPage;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        AddSimpleWorldInSearchFieldPage = new AddSimpleWorldInSearchFieldPage(driver);
    }
    @Test
    public void simpleWorld()throws InterruptedException{
        AddSimpleWorldInSearchFieldPage.searchSimpleWorld();
        AddSimpleWorldInSearchFieldPage.addSimpleWorld();
        AddSimpleWorldInSearchFieldPage.submitButton();
    }
}

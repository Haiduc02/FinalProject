package testCase;

import Pages.AddNumbersInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNumbersInSearchFieldTest extends BasePage {
    private AddNumbersInSearchFieldPage AddNumbersInSearchFieldPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        AddNumbersInSearchFieldPage = new AddNumbersInSearchFieldPage(driver);
    }

    @Test
    public void addNumbers ()throws InterruptedException{
        AddNumbersInSearchFieldPage.searchNumber();
        AddNumbersInSearchFieldPage.addNumbers();
        AddNumbersInSearchFieldPage.submitAction();
    }


}

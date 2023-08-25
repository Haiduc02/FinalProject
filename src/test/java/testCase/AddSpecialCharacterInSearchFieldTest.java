package testCase;

import Pages.AddSpecialCharacterInSearchFieldPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddSpecialCharacterInSearchFieldTest extends BasePage {

    private AddSpecialCharacterInSearchFieldPage AddSpecialCharacterInSearchFieldPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        AddSpecialCharacterInSearchFieldPage = new AddSpecialCharacterInSearchFieldPage(driver);
    }
    @Test
    public void useSearchField() throws InterruptedException{
        AddSpecialCharacterInSearchFieldPage.useSearchField();
    }
}

package testCase;

import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddSpecialCharacterInSearchFieldTest extends BasePage {

    private AddSpecialCharacterInSearchFieldTest AddSpecialCharacterInSearchFieldTest;

    @BeforeMethod
    public void setup(){
        super.setUp();
        AddSpecialCharacterInSearchFieldTest = new AddSpecialCharacterInSearchFieldTest(driver);
    }
    @Test
    public void useSearchField() throws InterruptedException{
        AddSpecialCharacterInSearchFieldTest.useSearchField();
    }
}

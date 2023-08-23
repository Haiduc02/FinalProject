package testCase;

import Pages.AwesomeGraniteChipsPage;
import Pages.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AwesomeGraniteChipsTest extends BasePage {

    private AwesomeGraniteChipsPage AwesomeGraniteChipsPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        AwesomeGraniteChipsPage = new AwesomeGraniteChipsPage(driver);
    }

    @Test

    public void clickOnGraniteChips() throws InterruptedException {
    AwesomeGraniteChipsPage.clickOnAwesomeGraniteChips();
    AwesomeGraniteChipsPage.clickOnHearthButton();
    }
}

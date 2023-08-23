package testCase;

import Pages.BasePage;
import Pages.SortFieldPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortFieldTest extends BasePage {

    private SortFieldPage SortFieldPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        SortFieldPage = new SortFieldPage(driver);
    }

    @Test
    public void sortField() throws InterruptedException{
        SortFieldPage.clickOnSortField();
        SortFieldPage.clickOnFirstOption();
    }
    @Test
    public void sortField() throws InterruptedException{
        SortFieldPage.clickOnSortField();
        SortFieldPage.clickOnSecondOption();
    }
    @Test
    public void sortField() throws InterruptedException{
        SortFieldPage.clickOnSortField();
        SortFieldPage.clickOnThirdOption();
    }
    @Test
    public void sortField() throws InterruptedException{
        SortFieldPage.clickOnSortField();
        SortFieldPage.clickOnFourthOption();
    }


}

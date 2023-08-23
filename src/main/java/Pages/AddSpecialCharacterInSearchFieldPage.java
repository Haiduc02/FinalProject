package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddSpecialCharacterInSearchFieldPage extends BasePage{

    public AddSpecialCharacterInSearchFieldPage(WebDriver driver){super(driver);}

    By useSearchField = By.id("input-search");

    public void useSearchField(){driver.findElement(useSearchField).sendKeys("@#%!");}

}

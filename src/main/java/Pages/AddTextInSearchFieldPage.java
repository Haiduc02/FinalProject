package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTextInSearchFieldPage extends BasePage{

    public AddTextInSearchFieldPage(WebDriver driver){super(driver);}

    By clickOnSearchBar = By.id("input-search");

    public void clickOnSearchBar(){driver.findElement(clickOnSearchBar).sendKeys("pop");}




}

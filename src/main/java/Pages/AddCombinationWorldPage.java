package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCombinationWorldPage extends BasePage{
    public AddCombinationWorldPage(WebDriver driver){super(driver);}

    By clickOnSearchField = By.id("input-search");
    public void enterText (){driver.findElement(clickOnSearchField).click();}
    public void searchText (){driver.findElement(clickOnSearchField).sendKeys("a@m2!");}

    By enter = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void submit (){driver.findElement(enter).click();}
}

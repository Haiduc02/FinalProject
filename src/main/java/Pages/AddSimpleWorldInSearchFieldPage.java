package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddSimpleWorldInSearchFieldPage extends BasePage{
    public AddSimpleWorldInSearchFieldPage(WebDriver driver){super(driver);}

    By search = By.id("input-search");
    public void searchSimpleWorld (){driver.findElement(search).click();}
    public void addSimpleWorld (){driver.findElement(search).sendKeys("Awesome");}

    By submit = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void submitButton (){driver.findElement(submit).click();}
}

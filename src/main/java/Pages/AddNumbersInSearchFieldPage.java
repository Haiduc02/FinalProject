package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNumbersInSearchFieldPage extends BasePage {
    public AddNumbersInSearchFieldPage(WebDriver driver){super(driver);}

    By searchField = By.id("input-search");
    public void searchNumber (){driver.findElement(searchField).click();}
    public void addNumbers (){driver.findElement(searchField).sendKeys("1234");}

    By submit = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void submitAction (){driver.findElement(submit).click();}
}

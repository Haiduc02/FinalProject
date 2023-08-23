package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeGraniteChipsPage extends BasePage {

    public AwesomeGraniteChipsPage(WebDriver driver){super(driver);}

    By clickOnAwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void clickOnAwesomeGraniteChips(){ driver.findElement(clickOnAwesomeGraniteChips).click();}

    By clickOnHearthButton = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]/svg/path");
    public void clickOnHearthButton(){ driver.findElement(clickOnHearthButton).click();}


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeGraniteChipsPage extends BasePage {

    public AwesomeGraniteChipsPage(WebDriver driver){super(driver);}

    By clickOnAwesomeGraniteChips = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void clickOnAwesomeGraniteChips(){ driver.findElement(clickOnAwesomeGraniteChips).click();}

    By clickOnHearthButton = By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(3) > svg");
    public void clickOnHearthButton(){ driver.findElement(clickOnHearthButton).click();}


}

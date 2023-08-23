package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
    By clickOnItem = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/a");
    public void clickOnAwesomeMetalChair (){driver.findElement(clickOnItem).click();}


    By clickOnCartButton = By.xpath("/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]/svg/path");
    public void addToCart (){driver.findElement(clickOnCartButton).click();}
}


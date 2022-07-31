package pages;

import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Document;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class BasePages {
    public WebDriver driver;
    public WebDriverWait wait;


    //constructor
    public BasePages(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    //waite element method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //click method
    public void clickOn(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //enter value method
    public void write(By elementBy, String value) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(value);
    }

    // is element displayed
    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    //check of vis of element
    public void checkElement(By elementBy) {
        if( driver.findElement(elementBy).isEnabled()){
            System.out.println("Element is Enable");
        }else{
            System.out.println("Element is Disabled");
        }
    }
}

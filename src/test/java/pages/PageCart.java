package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCart extends BasePages{
    public PageCart(WebDriver driver) {
        super(driver);
    }

    public static final String BUTTON_CHECKOUT = "//button[@id=\"checkout\"]";

    public void movingToCheckout() {
        clickOn(By.xpath(BUTTON_CHECKOUT));
    }
}

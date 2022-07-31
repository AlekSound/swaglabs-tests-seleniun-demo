package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCheckout extends BasePages{
    public PageCheckout(WebDriver driver) {
        super(driver);
    }

    public static final String FIRST_NAME = "aaa";
    public static final String LAST_NAME = "bbb";
    public static final String ZIP_POSTAL_CODE = "ccc";

    public static final String FIELD_FIRST_NAME = "//input[@id=\"first-name\"]";
    public static final String FIELD_LAST_NAME = "//input[@id=\"last-name\"]";
    public static final String FIELD_ZIP_POSTAL_CODE = "//input[@id=\"postal-code\"]";
    public static final String BUTTON_CONTINUE = "//input[@id=\"continue\"]";
    public static final String BUTTON_FINISH = "//button[@id=\"finish\"]";
    public static final String ELEMENT_CHECKOUT_COMPLETED = "//span[text()=\"Checkout: Complete!\"]";


    public void enterFirstName() {
        write(By.xpath(FIELD_FIRST_NAME), FIRST_NAME);
    }

    public void enterLastName() {
        write(By.xpath(FIELD_LAST_NAME), LAST_NAME);
    }

    public void enterPostalCode() {
        write(By.xpath(FIELD_ZIP_POSTAL_CODE), ZIP_POSTAL_CODE);
    }

    public void movingToLastCheckoutStep() {
        clickOn(By.xpath(BUTTON_CONTINUE));
    }

    public void movingToFinishOfCheckout() {
        clickOn(By.xpath(BUTTON_FINISH));
    }

    public void checkCompletedCheckout() {
        isElementDisplayed(By.xpath(ELEMENT_CHECKOUT_COMPLETED));
    }
}

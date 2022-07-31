package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAuthorizing extends BasePages{
    public PageAuthorizing(WebDriver driver) {
        super(driver);
    }

    public static final String STANDARD_USER = "standard_user";
    public static final String LOCKED_USER = "locked_out_user";
    public static final String PASSWORD_CORRECT = "secret_sauce";
    public static final String PASSWORD_INCORRECT = "secret_sauce";

    public static final String HOME_PAGE = "https://www.saucedemo.com/";
    public static final String LOGO = "//div[@class=\"login_logo\"]";
    public static final String FIELD_USERNAME = "//input[@id=\"user-name\"]";
    public static final String FIELD_PASSWORD = "//input[@id=\"password\"]";
    public static final String BUTTON_LOGIN = "//input[@id=\"login-button\"]";



    public void goToPage() {
        driver.get(HOME_PAGE);
    }

    public void checkLogoLoginPage() {
        isElementDisplayed(By.xpath(LOGO));
    }

    public void enterCorrectUsername() {
        write(By.xpath(FIELD_USERNAME), STANDARD_USER);
    }

    public void enterIncorrectUsername() {
        write(By.xpath(FIELD_USERNAME), LOCKED_USER);
    }

    public void enterCorrectPassword() {
        write(By.xpath(FIELD_PASSWORD), PASSWORD_CORRECT);
    }

    public void enterIncorrectPassword() {
        write(By.xpath(FIELD_PASSWORD), PASSWORD_INCORRECT);
    }

    public void clickOnButtonLogin () {
        clickOn(By.xpath(BUTTON_LOGIN));
    }
}

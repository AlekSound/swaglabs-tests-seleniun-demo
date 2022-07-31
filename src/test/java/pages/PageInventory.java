package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageInventory extends BasePages{
    public PageInventory(WebDriver driver) {
        super(driver);
    }

    public static final String LOGO_APP = "//div[@class=\"app_logo\"]";
    public static final String BUTTON_ADD_TO_CART_ONE = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]";
    public static final String BUTTON_ADD_TO_CART_TWO = "//button[@id=\"add-to-cart-sauce-labs-bike-light\"]";
    public static final String BUTTON_TO_CART = "//div[@id=\"shopping_cart_container\"]";
    public static final String BUTTON_BURGER_MENU = "//button[@id=\"react-burger-menu-btn\"]";

    public void checkLogoInventoryPage() {
        isElementDisplayed(By.xpath(LOGO_APP));
    }

    public void addItemOneToCart() {
        clickOn(By.xpath(BUTTON_ADD_TO_CART_ONE));
    }

    public void addItemTwoToCart() {
        clickOn(By.xpath(BUTTON_ADD_TO_CART_TWO));
    }

    public void movingToCart() {
        clickOn(By.xpath(BUTTON_TO_CART));
    }

    public void checkOfBurger() {
        checkElement(By.xpath(BUTTON_BURGER_MENU));
    }
}

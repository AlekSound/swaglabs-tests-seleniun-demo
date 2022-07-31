package tests;

import org.testng.annotations.Test;
import pages.BasePages;

public class Tests extends BaseTests {

    @Test (description = "Check of app loaded")
    public void checkOfLogo() {
        pageAuthorizing.checkLogoLoginPage();
    }

    @Test (description = "Check of successful authorize")
    public void successfulLogin() throws InterruptedException {
            pageAuthorizing.enterCorrectUsername();
            pageAuthorizing.enterCorrectPassword();
            pageAuthorizing.clickOnButtonLogin();
            Thread.sleep(2000);
            pageInventory.checkLogoInventoryPage();
    }

    @Test (description = "Check of successful payment - one item add to cart and pay")
    public void paymentSuccessfulOneItem() throws InterruptedException {
        pageAuthorizing.enterCorrectUsername();
        pageAuthorizing.enterCorrectPassword();
        pageAuthorizing.clickOnButtonLogin();
        Thread.sleep(2000);
        pageInventory.addItemOneToCart();
        pageInventory.movingToCart();

        pageCart.movingToCheckout();

        pageCheckout.enterFirstName();
        pageCheckout.enterLastName();
        pageCheckout.enterPostalCode();
        pageCheckout.movingToLastCheckoutStep();
        pageCheckout.movingToFinishOfCheckout();
        pageCheckout.checkCompletedCheckout();
    }
}

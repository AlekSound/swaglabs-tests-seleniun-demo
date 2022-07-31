package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.PageAuthorizing;
import pages.PageCart;
import pages.PageCheckout;
import pages.PageInventory;

public class BaseTests {
    public PageAuthorizing pageAuthorizing;
    public PageInventory pageInventory;
    public PageCart pageCart;
    public PageCheckout pageCheckout;

    WebDriver driver;


    @BeforeTest
    public void prestart() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        pageAuthorizing = PageFactory.initElements(driver, PageAuthorizing.class);
        pageInventory = PageFactory.initElements(driver, PageInventory.class);
        pageCart = PageFactory.initElements(driver, PageCart.class);
        pageCheckout = PageFactory.initElements(driver, PageCheckout.class);
        pageAuthorizing.goToPage();
    }

    @AfterMethod
    public void finish() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}

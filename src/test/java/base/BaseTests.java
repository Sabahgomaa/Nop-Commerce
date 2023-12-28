package base;
import TestCases.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage =new HomePage(driver);
    }
    @AfterMethod
    public void tearDown()  {
//        Thread.sleep(3000);
        driver.quit();
    }

}

package TestCases;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetTest extends BaseTests {
    @Test
    public void testSuccessfulReset(){
        LoginPage loginPage1 =homePage.clickFormLoginTap();
        ResetPasswordPage registerPage =loginPage.clickForgetPasswordBtn();
        registerPage.setEmail("test@gmail.com");
        HomePage homePage = registerPage.clickRecoveryButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
    }
}

package TestCases;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormLoginTap();
        loginPage.setEmail("sabahgomaa576@gmail.com");
        loginPage.setPassword("123456");
        HomePage homePage = loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/login?returnurl=%2F");
    }
    @Test
    public void testLoginWithEmptyEmailField(){
        LoginPage loginPage = homePage.clickFormLoginTap();
        loginPage.setEmail("");
        loginPage.setPassword("123456");
        HomePage homePage = loginPage.clickLoginButton();
        boolean  errorMsg = loginPage.getEmailError().contains("Please enter your email");
        Assert.assertTrue(errorMsg);
    }
    @Test
    public void testLoginWithEmptyPassword(){
        LoginPage loginPage = homePage.clickFormLoginTap();
        loginPage.setEmail("sabahgomaa576@gmail.com");
        loginPage.setPassword("");
        HomePage homePage = loginPage.clickLoginButton();
        boolean  errorMsg = loginPage.getValidationError().contains("Login was unsuccessful.");
        Assert.assertTrue(errorMsg);
    }
    @Test
    public void testLoginWithUnregisteredEmail(){
        LoginPage loginPage = homePage.clickFormLoginTap();
        loginPage.setEmail("sabahgomaa@gmail.com");
        loginPage.setPassword("123456");
        HomePage homePage = loginPage.clickLoginButton();
        boolean  errorMsg = loginPage.getValidationError().contains("Login was unsuccessful.");
        Assert.assertTrue(errorMsg);
    }
}
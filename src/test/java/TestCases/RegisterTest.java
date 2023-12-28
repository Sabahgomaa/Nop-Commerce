package TestCases;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTests {
    @Test
    public void testSuccessfulRegister(){
        RegisterPage registerPage = homePage.clickFormRegisterTap();
        registerPage.setGenderRadioBtnFemale();
        registerPage.setFirstNameField("test1");
        registerPage.setLastNameField("auto");
        registerPage.setEmail("test@gmail.com");
        registerPage.setPassword("123456789");
        registerPage.setConfirmPassword("123456789");
        HomePage homePage = registerPage.clickRegisterButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/register?returnurl=%2F");
    }

}

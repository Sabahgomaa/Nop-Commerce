package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {

    protected WebDriver driver;
    private By emailField = By.id("Email");
    private By recoveryBtn = By.className("password-recovery-button");



    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public HomePage clickRecoveryButton() {
        driver.findElement(recoveryBtn).click();
        return new HomePage(driver);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private By emailField = By.id("Email");
    private By emailFieldError = By.id("Email-error");
    private By passwordField = By.id("Password");
    private By validationError = By.className("message-error");
    private By loginButton = By.className("login-button");
    private By forgetPasswordBtn = By.className("forgot-password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public String getEmailError() {
        return driver.findElement(emailFieldError).getText();
    }

    public String getValidationError() {
        return driver.findElement(validationError).getText();
    }
    public ResetPasswordPage clickForgetPasswordBtn(){
        driver.findElement(forgetPasswordBtn).click();
        return new ResetPasswordPage(driver);
    }
}
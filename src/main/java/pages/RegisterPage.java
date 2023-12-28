package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    protected WebDriver driver;
private By genderRadioBtnFemale=By.id("gender-female");

    private By firstNameField=By.id("FirstName");
    private By lastNameField=By.id("LastName");
    private By emailField=By.id("Email");
    private By passwordField=By.id("Password");
    private By confirmPasswordField=By.id("ConfirmPassword");
    private By registerBtn=By.id("register-button");
    public RegisterPage(WebDriver driver){
        this.driver =driver;
    }


    public void setFirstNameField(String fName){
        driver.findElement(firstNameField).sendKeys(fName);
    }
    public void setGenderRadioBtnFemale(){
        driver.findElement(genderRadioBtnFemale).click();
    }
    public void setLastNameField(String lName){
        driver.findElement(lastNameField).sendKeys(lName);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public HomePage clickRegisterButton(){
        driver.findElement(registerBtn).click();
        return new HomePage(driver);
    }
}

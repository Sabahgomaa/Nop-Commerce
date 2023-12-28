package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    private By formLoginTap = By.className("ico-login");
    private By formRegisterTap = By.className("ico-register");
    private By searchField =By.id("small-searchterms");
    private By searchBtn =By.className("search-box-button");
    private By addToCartBtn =By.className("product-box-add-to-cart-button");
    private By addToWishListBtn =By.className("add-to-wishlist-button");
    private By productTitle =By.className("product-title");
    private  By content=By.className("content");
    private By shoppingCartLnk=By.linkText("shopping cart");
    private By wishingListLnk=By.linkText("wishlist");

    private  By closeBtn=By.className("close");
  public HomePage(WebDriver driver){
      this.driver=driver;
  }
    public LoginPage clickFormLoginTap(){

      driver.findElement(formLoginTap).click();
      return  new LoginPage(driver);
    }
    public RegisterPage clickFormRegisterTap(){

        driver.findElement(formRegisterTap).click();
        return  new RegisterPage(driver);
    }
    public void setSearchField(String itemSearch){
        driver.findElement(searchField).sendKeys(itemSearch);
    }
    public SearchPage clickSearchBtn(){
        driver.findElement(searchBtn).click();
        return  new SearchPage(driver);
    }
    public void clickAddToCartBtn(int num){
        driver.findElements(addToCartBtn).get(num).click();
    }
    public ShoppingCartPage clickShoppingCartLnk(){
        driver.findElement(shoppingCartLnk).click();
        return new ShoppingCartPage(driver);
    }
    public void clickAddToWishListBtn(int num){
        driver.findElements(addToWishListBtn).get(num).click();
    }
    public ShoppingCartPage clickWishingListLnk(){
        driver.findElement(wishingListLnk).click();
        return new ShoppingCartPage(driver);
    }
    public String getSuccessMsg(){
        return driver.findElement(content).getText();
    }
}

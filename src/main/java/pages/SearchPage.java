package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    protected WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    private By productTitle= By.className("product-title");
   // private By notFoundProduct = By.className("no-result");

    public String getProductTitle(int num){
        return driver.findElements(productTitle).get(num).getText();
    }
    public ProductPage getProductPage(){
        driver.findElement(productTitle).click();
        return new ProductPage(driver);
    }

//    public  String getNotFoundProductTitle(){
//        return driver.findElement(notFoundProduct).getText();
//    }
}

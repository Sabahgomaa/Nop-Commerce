package TestCases;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchPage;

import java.util.Random;

public class SearchTest extends BaseTests {

    @Test
    public void testSearchWithProductName(){
        homePage.setSearchField("book");
        SearchPage searchPage = homePage.clickSearchBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=book");
//        Random rand = new Random();
//        int max=5,min=0;
//        int num1 =rand.nextInt(max - min + 1) + min;
        boolean productTitle1 = searchPage.getProductTitle(3).contains(" book");
        Assert.assertTrue(productTitle1);
    }
    @Test
    public void testSearchWithProductSKU(){
        homePage.setSearchField("AS_551_LP");
        SearchPage searchPage = homePage.clickSearchBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=AS_551_LP");
        ProductPage productPage = searchPage.getProductPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/asus-n551jk-xo076h-laptop");
    }

    @Test
    public void testSearchWithProductNameNotFound(){
        homePage.setSearchField("fish");
        SearchPage searchPage = homePage.clickSearchBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=fish");
    }
}

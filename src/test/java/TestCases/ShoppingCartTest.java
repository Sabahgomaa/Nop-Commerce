package TestCases;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import java.util.Random;

public class ShoppingCartTest extends BaseTests {
    @Test
    public void AddToShoppingCartSuccessfully()
    {
        Random rand = new Random();
        int max=3,min=0;
        int num1 =rand.nextInt(max - min + 1) + min;
        homePage.clickAddToCartBtn(num1);
        boolean addToCartMsg = homePage.getSuccessMsg().contains("The product has been added");
        Assert.assertTrue(addToCartMsg);
        ShoppingCartPage shoppingCartPage = homePage.clickShoppingCartLnk();
    }
}

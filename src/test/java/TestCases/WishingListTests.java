package TestCases;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;

import java.util.Random;

public class WishingListTests extends BaseTests {
    @Test
    public void AddToWishingListSuccessfully()
    {
        Random rand = new Random();
        int max=3,min=0;
        int num1 =rand.nextInt(max - min + 1) + min;
        homePage.clickAddToWishListBtn(num1);
        boolean addToCartMsg = homePage.getSuccessMsg().contains("The product has been added");
        Assert.assertTrue(addToCartMsg);
        ShoppingCartPage shoppingCartPage = homePage.clickWishingListLnk();
    }

}

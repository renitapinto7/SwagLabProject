package Tests;

import org.testng.annotations.Test;

import Pages.homepage;
import Pages.loginpage;

public class homepagetest extends baseclass{


	@Test
	public void TC01_AddToCartTest() {
		loginpage lp = new loginpage();
		homepage hp = new homepage();
		lp.loginToSwagLabs("standard_user", "secret_sauce");
		hp.verifyHomePage();
		hp.itemAddToCart("Sauce Labs Backpack");
		hp.verifyNumberOfItemAddedToCart(1);
	}
}
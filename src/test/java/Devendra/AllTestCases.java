package Devendra;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Devendra.Pages.CartPage;
import Devendra.Pages.CheckoutPage;
import Devendra.Pages.ConfirmationPage;
import Devendra.Pages.ProductPage;

public class AllTestCases extends BaseTest{

	@Test
    public void validLoginTest() throws IOException, InterruptedException {
		 launchApplication();
    }
	
	@Test(dependsOnMethods = {"validLoginTest"})
	public void validateProductpage() {
		ProductPage pp=new ProductPage(driver);
		 pp.addToCart();
	}
	
	@Test(dependsOnMethods = {"validateProductpage"})
	public void validateCartPage() {
		CartPage cp = new CartPage(driver);
		cp.clickOnCart();
		cp.clickOnCheckout();
	}
	
	
	@Test(dependsOnMethods = {"validateCartPage"})
	public void validateCheckoutPage() {
		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.userDetails("Rahul", "Muwal", "466011");
        checkout.finishBtn();
	}
	
	@Test(dependsOnMethods = {"validateCheckoutPage"})
	public void validateConfirmationPage() {
		ConfirmationPage Confirmmessage = new ConfirmationPage(driver);
        Confirmmessage.getConfirmation();
        
	}
	
}


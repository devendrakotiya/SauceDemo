package Devendra.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutbtn;
	
	public void clickOnCart()
	{
		cart.click();
	}
	
	public void clickOnCheckout()
	{
		checkoutbtn.click();
	}
	
	
	
}

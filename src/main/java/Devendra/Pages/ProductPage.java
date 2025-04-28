package Devendra.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addtocartbtn ;
	
	public void addToCart() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addtocartbtn);
		addtocartbtn.click();
		
	}
	
}

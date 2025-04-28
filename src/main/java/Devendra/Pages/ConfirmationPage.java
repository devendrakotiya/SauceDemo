package Devendra.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="complete-header")
	WebElement successMessage;
	
	public void getConfirmation() {
		
		
		
		if (successMessage.isDisplayed() && successMessage.getText().equals("Thank you for your order!")) {
	        System.out.println("Order placed successfully!");
	    } else {
	        System.out.println("Order not placed!");
	    }
	}
    
	
}

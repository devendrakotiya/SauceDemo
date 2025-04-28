package Devendra.Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement userName ;
	
	@FindBy(id="password")
	WebElement pass ;
	
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void goTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public void logintoUI(String username, String password) {
		userName.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
	}
	
	
}

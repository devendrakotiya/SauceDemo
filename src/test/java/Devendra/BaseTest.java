package Devendra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Devendra.Pages.LoginPage;

public class BaseTest {

	public WebDriver driver ;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rohit\\eclipse-workspace\\SauceDemo\\src\\main\\java\\Devendra\\resources\\global.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public LoginPage launchApplication() throws IOException
	{
		driver = initializeDriver();
		 LoginPage lp = new LoginPage(driver);
		 lp.goTo();
		 lp.logintoUI("standard_user", "secret_sauce");
		return lp;
	}


}

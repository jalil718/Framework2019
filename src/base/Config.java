package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Config {

	public WebDriver driver=null;
		
		
	

	@BeforeTest
	public void beforeTestStart(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/mdjal/Documents/GitHub/Framework2019/Drivers//chromedriver.exe");		// init the chrome driver
		driver = new ChromeDriver();
		// lets go to facebook.com
		driver.get("http://www.facebook.com");
		// maximize the window 
	} 
	@AfterMethod
	public void aftereachtest(){
		driver.close();
	}
		
		
		
		
		
		
		
		
		
		
		
	

}

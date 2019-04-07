package base;

import java.util.concurrent.TimeUnit;

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
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	} 
	@AfterMethod
	public void aftereachtest(){
		driver.close();
	}
		
		
		
		
		
		
		
		
		
		
		
	

}

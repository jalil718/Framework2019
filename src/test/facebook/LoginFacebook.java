package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFacebook {
	
		protected WebDriver driver=null;
		
		@Test
		public void testFacebookSignup(){

		System.setProperty("webdriver.chrome.driver", "C:/Users/mdjal/Documents/GitHub/Framework2019/Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		String fnLoc = "//input[@name='firstname']";
		String lnLoc = "//input[@name='lastname']";
		// Values
		String fnVal = "fnTest";
		String lnVal = "lnTest";
		

		// Enter firstName
		driver.findElement(By.xpath(fnLoc)).sendKeys(fnVal);
		// Enter lastName
		driver.findElement(By.xpath(lnLoc)).sendKeys(lnVal);

		}	
		
		
		


		
		
		
		
		
		
		
	}



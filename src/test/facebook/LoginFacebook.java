package test.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Config;
import fbLocators.Locators;
import fbValue.Values;

public class LoginFacebook extends Config {
	
		
		@Test
		public void testFacebookSignup(){
			
			Locators 	fbl = new Locators();
			Values			fbv = new Values();
			
		
		

		// Enter firstName
		driver.findElement(By.xpath(fbl.fnLoc)).sendKeys(fbv.fnVal);

		// Enter lastName
		driver.findElement(By.xpath(fbl.lnLoc)).sendKeys(fbv.lnVal);


		}	
		
		
		


		
		
		
		
		
		
		
	}



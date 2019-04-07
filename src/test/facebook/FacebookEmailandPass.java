package test.facebook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import fbLocators.Locators;
import fbValue.Values;

public class FacebookEmailandPass extends Config {
	
	

		
		@Test // test annotion - without this annotation, you can't execute any tes
		public void testFacebookEmailPass1(){
			
			Locators 	fbl = new Locators();
			Values		fbv = new Values();
	
	

	// Enter firstName
	driver.findElement(By.xpath(fbl.email)).sendKeys(fbv.emailVal);
	// Enter lastName
	driver.findElement(By.xpath(fbl.pass)).sendKeys(fbv.passVal);

	
	}	
}
		
		
		
		
		
		
		
		
		
		
		
	



package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/mdjal/Documents/GitHub/Framework2019/Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String fnloc="//input[@id='u_0_c']";
		String lnloc="//input[@id='u_0_e']";
		
		String fnval="MYfirstname";
		String lnval="lastname";
		
		driver.findElement(By.xpath("fnloc")).sendKeys("fnloc");
		driver.findElement(By.xpath("lnloc")).sendKeys("lnval");
		
//		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys("MYfirstname");
//		driver.findElement(By.xpath("//input[@id='u_0_e']")).sendKeys("lastname");
		
		


		
		
		
		
		
		
		
	}

}

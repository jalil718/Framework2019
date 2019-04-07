package test.facebook;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Priorityprec {

	
	@Test (priority=2)
	public void changepass(){
		System.out.println("Changing password");
	}
	
	@Test (priority=3)
	public void LogOutTest(){
		System.out.println("Log Out Password");
	}
	@Test(priority=1)
	public void LogInTest(){
		System.out.println("Login First");
	}
	
	@Test(priority=4)
	public void gointoskiptest(){
		System.out.println("skipped this test");
		throw new SkipException ("SF-1: Requirement change so skip it");
	}
	






















}

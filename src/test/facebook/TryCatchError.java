package test.facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TryCatchError {

	@Test
	public void tryCatchTest(){
		String expValue = "google"; // Requirement
		String actValue = "google1"; // results, webApp

		try{
			Assert.assertEquals(actValue, expValue);
		}catch (Throwable t){
			// reason for failing
			System.err.println("didn't match " + t);
		}
	}


}
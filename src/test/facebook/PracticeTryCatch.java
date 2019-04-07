package test.facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTryCatch {

	@Test
	public void tryCatchTest(){
	String expValue="google";
	String actValue="google1";
	 
	try {
		Assert.assertEquals(expValue, actValue);
	}catch (Throwable t){
		System.out.println("Didn't match"+t);
	}















	}



}

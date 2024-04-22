package Skip_Retry_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Testcase 
{
	//create a class with test case to utilize the above class
	@Test (retryAnalyzer=Skip_Retry_testcases.RetryLogic.class)
	
	public void login()
	{
		Assert.assertFalse(true, "Retry this test case");
	}
}

package Skip_Retry_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTestcase 
{
	@Test
	public void login()
	{
		Assert.assertTrue(false); //login is failed
	}
	
	@Test (priority=1,dependsOnMethods="login") //skipped logout
	public void logout()
	{
		
	}

}

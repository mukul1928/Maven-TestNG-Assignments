package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Listener.class)

public class Listeners_skippedtcs 
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

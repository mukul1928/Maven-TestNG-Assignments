package Jaya_Maven.Selenium_Maven;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	@Test 
	public void test()
	{
		System.out.println("test enabled");
	}
	@Test (enabled=false)
	public void logout()
	{
		System.out.println("logout test");
	}

}

package Jaya_Maven.Selenium_Maven;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test (invocationCount=10)
	public void invokeTest()
	{
		System.out.println("invoke test parameter");
	}
	@Test
	public void test()
	{
		System.out.println("test test");
	}
	@Test
	public void logout()
	{
		System.out.println("logout test");
	}

}

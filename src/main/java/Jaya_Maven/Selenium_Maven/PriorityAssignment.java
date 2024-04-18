package Jaya_Maven.Selenium_Maven;

import org.testng.annotations.Test;

public class PriorityAssignment {
	
	@Test (priority=10)
	public void login()
	{
		System.out.println("login method");
	}
	
	@Test (priority=10)
	public void test()
	{
		System.out.println("test method");
	}

}

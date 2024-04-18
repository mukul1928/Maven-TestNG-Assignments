package Jaya_Maven.Selenium_Maven;

import org.testng.annotations.Test;

public class MultipleParameters {

	@Test (priority=1, invocationCount=2)
	public void add()
	{
		System.out.println("addition");
	}
	
	@Test (priority=0)
	public void sub()
	{
		System.out.println("subtraction");
	}
	
	@Test (priority=-1, invocationCount=3)
	public void div()
	{
		System.out.println("division");
	}
}

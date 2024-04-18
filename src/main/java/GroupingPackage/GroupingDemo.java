package GroupingPackage;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test (groups= {"smoke"})
	public void add()
	{
		System.out.println("addition");
	}
	
	@Test (groups= {"smoke","system"})
	public void sub()
	{
		System.out.println("subtraction");
	}
	
	@Test (groups= {"smoke","system"})
	public void multi()
	{
		System.out.println("subtraction");
	}
	
	@Test (groups= {"regression","system"})
	public void div()
	{
		System.out.println("subtraction");
	}
}

package DataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderString 
{
	@DataProvider(name="data1")
	public Object[][] method_names()
	{
		return new Object[][] {{"jaya"},{"sachit"},{"raju"}};	
	}

	@Test (dataProvider="data1")
	public void test(String names)
	{
		System.out.println(names.concat(" is Indian"));
	}
	
	@DataProvider(name="data2")
	public Object[][] method_rollNo()
	{
		return new Object[][] {{100},{200},{300},{400}};	
	}
	@Test (dataProvider="data2")
	public void method2(int rollNo)
	{
		System.out.println(rollNo +100);
	}
}

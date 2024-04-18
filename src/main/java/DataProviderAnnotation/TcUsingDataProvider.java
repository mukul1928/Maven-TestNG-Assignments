package DataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TcUsingDataProvider 
{
	@DataProvider (name="data1") //always parameterized, and attribute should be name always, value can be anything.
	public Object[][] method1() //the return type of @DataProvider is Object[][] - 2 dimensional
	{
		return new Object[][] {{15},{23}}; //it returns object of Object class of 2 dimensional, pass test data along
	}
	
	@Test (dataProvider="data1") //pass data provider attribute will the same value
	public void test1(int age) //test data type is int
	{
		System.out.println(age+10);
	}
	
	
}


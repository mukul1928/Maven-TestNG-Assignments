package Jaya_Maven.Selenium_Maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations 
{
	@Test 
	public void test()
	{
		System.out.println("@Test");
	}
	@BeforeTest 
	public void BT()
	{
		System.out.println("Before Test");
	}
	@AfterTest 
	public void AT()
	{
		System.out.println("After Test");
	}
	@BeforeClass 
	public void BC()
	{
		System.out.println("Before Class");
	}
	@AfterClass 
	public void AC()
	{
		System.out.println("After Class");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method");
	}
	@AfterMethod 
	public void AM()
	{
		System.out.println("After Method");
	}
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("After Suite");
	}

}

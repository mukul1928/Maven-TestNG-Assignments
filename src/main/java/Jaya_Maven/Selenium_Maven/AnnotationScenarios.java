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

public class AnnotationScenarios {
	
	@Test
	public void test()
	{
		System.out.println("@Test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("@Test");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("@Test");
	}
	
	/*@AfterSuite
	public void as()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass");
	}
	
	/*
	
/*	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	
	

	/*@BeforeTest
	public void bt()
	{
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("@AfterTest");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("@AfterClass");
	}
	
	*/
	
	
}

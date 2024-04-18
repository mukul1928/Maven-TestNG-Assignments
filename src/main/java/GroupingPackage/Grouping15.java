package GroupingPackage;

import org.testng.annotations.Test;

public class Grouping15 {
	
	@Test (groups= {"smoke","regression"})
	public void test1()
	{
		System.out.println("addition1");
	}
	
	@Test (groups= {"smoke", "regression"})
	public void test2()
	{
		System.out.println("addition2");
	}
	@Test (groups= {"system","regression"})
	public void test3()
	{
		System.out.println("addition3");
	}
	@Test (groups= {"component","regression"})
	public void test4()
	{
		System.out.println("addition4");
	}
	@Test (groups= {"sanity", "regression"})
	public void test5()
	{
		System.out.println("addition5");
	}
	@Test (groups= {"component", "regression", "smoke"})
	public void test6()
	{
		System.out.println("addition6");
	}
	@Test (groups= {"component","regression"})
	public void test7()
	{
		System.out.println("addition7");
	}
	@Test (groups= {"smoke", "regression"})
	public void test8()
	{
		System.out.println("addition8");
	}
	@Test (groups= {"system","regression"})
	public void test9()
	{
		System.out.println("addition9");
	}
	@Test (groups= {"system","regression"})
	public void test10()
	{
		System.out.println("addition10");
	}
	@Test (groups= {"component","regression","system"})
	public void test11()
	{
		System.out.println("addition11");
	}
	@Test (groups= {"system","regression"})
	public void test12()
	{
		System.out.println("addition12");
	}
	@Test (groups= {"component", "regression"})
	public void test13()
	{
		System.out.println("addition13");
	}
	@Test (groups= {"component","regression"})
	public void test14()
	{
		System.out.println("addition14");
	}
	@Test (groups= {"smoke","system","regression"})
	public void test15()
	{
		System.out.println("addition15");
	}

}

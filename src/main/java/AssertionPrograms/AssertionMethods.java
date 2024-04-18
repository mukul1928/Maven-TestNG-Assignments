package AssertionPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionMethods 
{
	long a=987654321;
	int x=500;
	
	@Test
	public void testcase_pass()
	{
		
		//Assert.assertTrue(true); //Assert is a class, assertTrue is method (actual result) and (true) is expected result
		//Assert.assertFalse(false); //pass
		//Assert.assertTrue(x>10);
		//Assert.assertEquals(false, false); //boolean
		//Assert.assertEquals(100, 100); //byte
		//Assert.assertEquals(987654321, a); //long
		//Assert.assertEquals(1000, 1000, "short equals"); //short
		//Assert.assertEquals(500, x, "Integers are same"); //int
		//Assert.assertEquals('a', 'a'); //char
		//Assert.assertEquals(100, 100); //object
		Assert.assertEquals("selenium", "selenium"); //string	
		
	}
	
	@Test (priority=1)
	public void testcase_fail()
	{
		//Assert.assertTrue(false); //fail
		//Assert.assertFalse(true); //fail
		//Assert.assertEquals(false, true, "expected is not equals actual");
		//Assert.assertEquals(2000, 100, "actual is not byte");
		//Assert.assertEquals(987654320, a, "long values are not equal"); 
		//Assert.assertEquals(10000, 1000, "short values are not equal"); 
		//Assert.assertEquals(500, x+10, "Integers are not same");
		//Assert.assertEquals('n', 'j', "different characters");
		//Assert.assertEquals(100, 105,"object not same");
		Assert.assertEquals("selenium", "java selenium", "strings are not same");
		
	}

}

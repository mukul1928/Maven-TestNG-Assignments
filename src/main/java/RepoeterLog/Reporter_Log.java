package RepoeterLog;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Log 
{
	@Test
	public void testcase()
	{
		System.out.println("test case pass");
		Reporter.log("print on report using this");
	}

}

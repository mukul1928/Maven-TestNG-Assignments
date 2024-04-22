package Skip_Retry_testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer //Create a class and implements IRetryAnalyzer
{
	int initial_count=0;
	int total_count=3;
	
	@Override //Add its unimplemented methods
	public boolean retry(ITestResult result) {
		
		if(initial_count<total_count) //Write your own logic to retry the test case
		{
			initial_count++;
			return true; //true - keep running failed tcs for infinite time
		}
		
		return false; //false - do not run the test case
	}
}

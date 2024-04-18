package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	@Test
	public void testcase1()
	{
	
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");

	}
}

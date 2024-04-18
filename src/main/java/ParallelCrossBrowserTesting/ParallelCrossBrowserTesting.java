package ParallelCrossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ParallelCrossBrowserTesting {
	
	@Test
	public void chrome_browser()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//ChromeDriver driver = new ChromeDriver();
	
	
		FirefoxDriver driver1 = new FirefoxDriver();
		
		
		//SafariDriver driver = new SafariDriver();
		
	}

}

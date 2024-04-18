package ParallelCrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SwitchCaseBrowsers {
	
	WebDriver driver;
	@Test
	public void testcase1() {
		switch (4) {
		case 1: 
		{
			System.out.println("Google Chrome Launch");
			 driver=new ChromeDriver();
			break;
		}
		case 2: 
		{
			System.out.println("Firefox browser Launch");
			 driver=new FirefoxDriver();
			break;

		}
		case 3: 
		{
			System.out.println("Edge browser Launch");			
			driver=new EdgeDriver();
			break;
		}
		case 4:
		{
			System.out.println("IE browser launch");
			driver=new InternetExplorerDriver();
		}
		
		default:
			System.out.println("The selection you have made is wrong");

		}

    }
}

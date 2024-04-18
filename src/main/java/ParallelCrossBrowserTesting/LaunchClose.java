package ParallelCrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchClose {
	
WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void Launch(String browsername){
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
            driver.manage().window().maximize();
		}
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		//	driver.manage().window().maximize();
		}
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		//	driver.manage().window().maximize();
		}
	
	}
	@AfterMethod
	public void Quit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}

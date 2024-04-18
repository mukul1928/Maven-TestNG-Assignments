package AmazonCartTestcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuitBrowser 
{
	ChromeDriver driver; //global variable
	
	@BeforeMethod
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
	}
	
	@AfterMethod
	public void close_browser() throws InterruptedException, IOException
	{
		TakesScreenshot tss=driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\Screenshots\\One"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}



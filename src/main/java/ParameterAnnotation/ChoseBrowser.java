package ParameterAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChoseBrowser {
	WebDriver driver;
	@Test
	@Parameters ("browser") //always parameterized, if 2 parameters- we need to pass 2 parameters in method
	
	public void google(String nameOfBrowser)
	{
		if(nameOfBrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(nameOfBrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if(nameOfBrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
	}

}

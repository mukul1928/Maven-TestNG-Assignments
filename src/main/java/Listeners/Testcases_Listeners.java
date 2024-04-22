package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Listener.class)

public class Testcases_Listeners 
{
	@Test
	public void testcase1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertFalse(true);
	}

}

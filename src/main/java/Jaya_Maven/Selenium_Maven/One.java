package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class One 
{
	@Test 
	public void amazon_login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("jaya@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("34fgbn$%");
		driver.findElement(By.id("signInSubmit")).click();
			
	}
	
}

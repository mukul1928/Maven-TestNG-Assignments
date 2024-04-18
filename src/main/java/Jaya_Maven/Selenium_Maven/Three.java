package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Three {
	
	@Test 
	public void facebook_login()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("jaya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hyS@#234");
		driver.findElement(By.name("login")).click();
	}

}

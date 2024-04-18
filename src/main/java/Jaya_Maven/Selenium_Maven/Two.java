package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two 
{
	@Test 
	public void flipkart_login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
	
		
		WebElement  login =driver.findElement(By.xpath("//span[.='Login']"));
		login.click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[.='Request OTP']")).click();
	}

}

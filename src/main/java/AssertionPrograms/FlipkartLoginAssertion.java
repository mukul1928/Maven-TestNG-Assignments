package AssertionPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartLoginAssertion 
{
	@Test
	public void flipkart_login() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement login=driver.findElement(By.xpath("//span[.='Login']"));
		login.click();
		
		WebElement uname=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		uname.sendKeys("9986263210");
		
		WebElement otp=driver.findElement(By.xpath("//button[.='Request OTP']"));
		otp.click();
		
		Assert.assertTrue(otp.isDisplayed());
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

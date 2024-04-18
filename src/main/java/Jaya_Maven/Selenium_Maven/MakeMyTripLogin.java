package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTripLogin 
{
	@Test
	public void makemytrip() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		
		WebElement mobile=	driver.findElement(By.xpath("//input[@class='font14 fullWidth']"));
		mobile.sendKeys("9986263210");
		
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}

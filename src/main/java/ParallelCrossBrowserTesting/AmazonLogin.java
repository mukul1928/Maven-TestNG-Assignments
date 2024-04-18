package ParallelCrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin extends LaunchClose
{
	@Test
	public void amazon_login()
	{
		driver.get("https://www.amazon.in");
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("9986263210");
		
		driver.findElement(By.id("continue")).click();
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Amazon@123");
		
		driver.findElement(By.id("signInSubmit")).click();
	}
	

}

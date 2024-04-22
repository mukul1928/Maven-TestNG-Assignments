package Skip_Retry_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipAmazonLogout 
{
	WebDriver driver;
	@Test
	public void amazon_login()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		//Login to amazon
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
				
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
				
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
				
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("9986263210");
				
		driver.findElement(By.id("continue")).click();
				
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("Amazon@123");
				
		driver.findElement(By.id("signInSubmits")).click(); //By.id("signInSubmit") failed submit
		
		//Assert.assertTrue(false); //login is failed
	}
	
	@Test (priority=1,dependsOnMethods="amazon_login") //skipped logout
	public void amazon_logout() throws InterruptedException
	{
		//Logout to amazon
		WebElement signout=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			
		Actions a1=new Actions(driver);
		a1.moveToElement(signout).perform();
		
		driver.findElement(By.xpath("//span[.='Sign Out']")).click();
		
		//System.out.println(driver.getTitle());
		
		//Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
		Thread.sleep(2000);
		driver.close();
	}
}

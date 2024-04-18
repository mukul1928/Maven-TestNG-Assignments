package ParallelCrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartLogin extends LaunchClose
{
	@Test
	public void flipkart_login()
	{
		driver.get("https://www.flipkart.com");
		WebElement hoveroverlogin = driver.findElement(By.xpath("//span[.='Login']"));	
		
		Actions a1=new Actions(driver);
		a1.moveToElement(hoveroverlogin).perform();
		WebElement signup=driver.findElement(By.xpath("//span[.='Sign Up']"));
	    signup.click();
	    
	    WebElement mobilenumber=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobilenumber.sendKeys("9987643123");
	    WebElement continuebutton= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		continuebutton.click();
	}

}

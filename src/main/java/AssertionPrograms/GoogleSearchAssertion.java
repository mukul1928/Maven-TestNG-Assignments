package AssertionPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchAssertion 
{
	@Test
	public void google_search() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		WebElement google_search=driver.findElement(By.name("q"));
		google_search.sendKeys("India");
		google_search.sendKeys(Keys.ENTER);
		
		//System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "India - Google Search");
		
		Thread.sleep(2000);
		driver.quit();
	}

}

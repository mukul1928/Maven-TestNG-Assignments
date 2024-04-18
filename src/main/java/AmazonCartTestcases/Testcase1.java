package AmazonCartTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchQuitBrowser
{
	@Test
	public void search()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		
	}
	
}

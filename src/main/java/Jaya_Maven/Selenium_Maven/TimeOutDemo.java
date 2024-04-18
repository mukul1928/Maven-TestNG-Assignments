package Jaya_Maven.Selenium_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutDemo {
	
	@Test (timeOut=1000) //after 1 second it stops execution
	public void demo()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoblaze.com/");
		
		String title=driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int links_count=links.size();
		System.out.println("Total links: "+links_count);
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		int img_count=images.size();
		System.out.println("Total images: "+img_count);
						
	}
}

package AmazonCartTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchQuitBrowser
{
	@Test
	public void first_product()
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		
		WebElement search_btn=driver.findElement(By.id("nav-search-submit-button"));
		search_btn.click();
		
		WebElement first_shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		first_shoe.click();
	}
}

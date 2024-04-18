package CrossBrowserAssignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchProduct1 extends LaunchQuit
{
	
	@Test
	public void search_product()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop bags");
		search.sendKeys(Keys.ENTER);
		
		//selecting product
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		
		Set<String> windrow=driver.getWindowHandles();
		Iterator<String> s1=windrow.iterator();
		String parent_window=s1.next();
		String child_window=s1.next();
		driver.switchTo().window(child_window);
		
		//adding to wish list
		driver.findElement(By.cssSelector("input[value='Add to Wish List']")).click();
		
		//view your wish list
		driver.switchTo().defaultContent();
		WebElement view_list=driver.findElement(By.xpath("(//a[@class='a-button-text'])[4]"));
		view_list.click();
		
		//add to cart
		driver.findElement(By.partialLinkText("Add")).click();
		
		//proceed to checkout
		driver.findElement(By.xpath("//span[@class='a-button a-button-primary g-cart-checkout-btn']")).click();
		
		//select the address
		//driver.findElement(By.xpath("(//input[@name='submissionURL'])[3]")).click(); //radio button of addresses
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		//select cc payment
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
					
	}

}

/*  
  <class name="CrossBrowserAssignment.AddNewAddress2"/> 
 
<class name="CrossBrowserAssignment.WishlistProduct3"/>
<class name="CrossBrowserAssignment.SortProduct4"/> */
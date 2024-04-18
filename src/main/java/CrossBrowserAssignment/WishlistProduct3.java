package CrossBrowserAssignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WishlistProduct3 extends LaunchQuit
{
	@Test
	public void wishlist_product()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement address=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(address).perform();
		
		driver.findElement(By.xpath("(//span[@class='nav-text'])[8]")).click(); //Your Wish list
		
		driver.findElement(By.name("submit.deleteItem")).click(); //delete one item from wish list
		//driver.findElement(By.name("submit.deleteItem")).click();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox")); //search shoes
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		//select second shoe
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")).click();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> ite=window.iterator();
		String parent=ite.next();
		String child=ite.next();
		driver.switchTo().window(child);
		
		driver.findElement(By.id("add-to-wishlist-button")).click(); //add to wish list
		
		//create another wish list
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("a[class='a-link-normal']")).click(); //not working
		//driver.findElement(By.id("atwl-dd-create-list")).click();
		//driver.findElement(By.xpath("//span[@class='a-size-small atwl-hz-vertical-align-middle']")).click();
	}

}

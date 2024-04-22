package AssertionPrograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPaymentAssertion 
{
	WebDriver driver;
	
	@Test
	public void payments() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		
		driver.findElement(By.id("signInSubmit")).click();
		
		//search product
		WebElement search_box=driver.findElement(By.id("twotabsearchtextbox"));
		search_box.sendKeys("watches for women");
		search_box.sendKeys(Keys.ENTER);
		
		//selecting first product 
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		Set<String> windrow=driver.getWindowHandles();
		Iterator<String> s1=windrow.iterator();
		String parent_window=s1.next();
		String child_window=s1.next();
		driver.switchTo().window(child_window);
		
		//add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//proceed to buy
		driver.findElement(By.name("proceedToRetailCheckout")).click();
				
		//select the address
		//driver.findElement(By.xpath("(//input[@name='submissionURL'])[3]")).click(); //radio button of addresses
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
				
		//select cc payment
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Checkout");
		
		Thread.sleep(2000);
		driver.quit();
	}
}


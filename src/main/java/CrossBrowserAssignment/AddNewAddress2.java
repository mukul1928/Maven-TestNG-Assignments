package CrossBrowserAssignment;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddNewAddress2 extends LaunchQuit
{
	@Test
	public void add_address() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement address=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(address).perform();
		
		driver.findElement(By.xpath("(//span[@class='nav-text'])[6]")).click(); //Your Account
		
		driver.findElement(By.xpath("(//span[@class='a-color-secondary'])[4]")).click(); //Your Addresses
		
		driver.findElement(By.id("ya-myab-plus-address-icon")).click(); //Add Address
		
		//Add a new address 
	/*	WebElement country=driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]"));
		Select ct=new Select(country);
		ct.selectByValue("IN"); */
		
		WebElement fullName=driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
		fullName.sendKeys("Sachit Sureban");
		
		WebElement mobile=driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		mobile.sendKeys("1234567890");
		
		WebElement pincode=driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode"));
		pincode.sendKeys("591102");
		
		WebElement houseNo=driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		houseNo.sendKeys("1073");
		
		WebElement area=driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		area.sendKeys("Vidya Nagar");
		
		WebElement landmark=driver.findElement(By.id("address-ui-widgets-landmark"));
		landmark.sendKeys("Near old bus stop");
		
	/*	WebElement city=driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		city.sendKeys("Bailhongal");
		
		WebElement stateDropdown=driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[2]"));
		
		Select st=new Select(stateDropdown);
		st.selectByValue("KARNATAKA"); */
		
		driver.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
		
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Add address']")).click();

		
		//Search a new product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("dell laptop");
		search.sendKeys(Keys.ENTER);
		
		//selecting product and adding to cart
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> wins=windows.iterator();
		String parent_window=wins.next();
		String child_window=wins.next();
		driver.switchTo().window(child_window);
		
		//select new address
		driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		
		driver.findElement(By.xpath("//input[@name='42JF2GAYN3MS2VJLEVOUG13G9QE9P23CA4A4AC32P9EQ9GYPXTQ2EIA2OXCL2XFE:0:nkljkqhqmilq']")).click();
		
		//add to cart
		Thread.sleep(2000);	
		//driver.findElement(By.xpath("(//span[.='Add to Cart'])[6]")).click();
		//driver.findElement(By.id("submit.add-to-cart-announce")).click();
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		
		//proceed to checkout
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class='a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button']")).click();
	
		//select the address
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		//select net banking payment
		driver.findElement(By.xpath("//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")).click();
	
	}
	

}

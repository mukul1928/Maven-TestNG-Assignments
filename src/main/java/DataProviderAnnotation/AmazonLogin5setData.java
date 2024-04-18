package DataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLogin5setData 
{
	@DataProvider (name="login_data")
	public Object[][] login_data()
	{
		Object data[][]=new Object[5][2];
		
		data[0][0]="rachana@gmail.com";
		data[0][1]="rachana@123";
		
		data[1][0]="smita@gmail.com";
		data[1][1]="smita@123";
		
		data[2][0]="shiva@gmail.com";
		data[2][1]="shiva@4221";
		
		data[3][0]="chandan@gmail.com";
		data[3][1]="chandan@321";
		
		data[4][0]="jaya@gmail.com";
		data[4][1]="ja@12345";
		
		return data;
	}
	
	@Test (dataProvider="login_data")
	public void test_data(String username, String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		//Login to amazon
		WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys(username);
		
		driver.findElement(By.id("continue")).click();
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys(password);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}

package CrossBrowserAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchQuit {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void login(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();		
		}
		
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();	
		}
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
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
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}

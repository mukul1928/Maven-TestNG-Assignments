package DataProviderAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb_login_multiDimensional 
{
	@DataProvider(name="login_data")
	public Object[][] data_method()
	{
		//create object of 2 dimensional Object
		Object data[][]=new Object[2][2]; //[2][2] - rows and columns
		
		data[0][0]="jaya@gmail.com"; //right uname
		data[0][1]="jaya@123"; //right pwd
		data[1][0]="jaya@gmail.com"; //right uname
		data[1][1]="345tvb"; //wrong pwd
		
		return data; //return object data
		
	}
	
	@Test (dataProvider="login_data")
	public void login_method(String uname, String pwd)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
	}

}

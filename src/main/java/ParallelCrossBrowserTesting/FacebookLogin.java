package ParallelCrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookLogin extends LaunchClose
{
	
	@Test
	public void fb_login()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("9986263210");
		driver.findElement(By.name("pass")).sendKeys("Jaya@12&*");
		driver.findElement(By.name("login")).click();
		
	}

}

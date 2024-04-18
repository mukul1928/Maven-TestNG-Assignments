package Jaya_Maven.Selenium_Maven;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");

	}

}

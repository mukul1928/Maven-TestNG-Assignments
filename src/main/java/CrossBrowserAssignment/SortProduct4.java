package CrossBrowserAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SortProduct4 extends LaunchQuit
{
	@Test
	public void sort_mobiles()
	{
		//search product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.sendKeys(Keys.ENTER);
		
		//sorting 4 and up rating
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-medium a-star-medium-4'])[2]")).click();
		
	}

}

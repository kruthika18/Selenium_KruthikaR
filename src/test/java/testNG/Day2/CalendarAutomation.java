package testNG.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomation {

	@Test
	public void calensar() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		//By getting List of all dates
		List<WebElement> ele =driver.findElements(By.xpath("//a[contains(@class,'state-default')]"));
		for(WebElement e:ele)
		{
			if(e.getText().contains("25"))
			{
				e.click();
			}
		}
		
		

	}

}

package testNG.Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAlerts {

	@Test
	public void alertHandle() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(11));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();

		
		

	}

}

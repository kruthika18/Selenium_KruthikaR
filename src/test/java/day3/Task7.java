package day3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task7 {

	@Test
	public void task() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(11));
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Manage']")).isDisplayed(),true);
		WebElement ele=driver.findElement(By.xpath("//span[text()='Manage']"));
		action.moveToElement(ele).perform();
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Manage Categories']")).click();
		Set<String> allWindowHandle=driver.getWindowHandles();
	        for(String child:allWindowHandle)
	        {
	            
	            if(!child.equals(parent))
	            {
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//button[text()='Add New Category ']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(11));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.sendKeys("Automation1234678");
		alt.accept();
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//td[text()='Automation1234678']//following::button[1]")));
        
        //driver.findElement(By.xpath("//td[text()='PythonJava']//following::button[1]")).click();
        
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[text()='Automation1234678']//following::button[1]")));
        
//        //Alert alt1=driver.switchTo().alert();
//		driver.findElement(By.xpath("//td[text()='Automation1234678']//following::button[1]")).click();
//		driver.findElement(By.xpath("//button[text()='Delete']")).click();

	}

	 }
	}
}

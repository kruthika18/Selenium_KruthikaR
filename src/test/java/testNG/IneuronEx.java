package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IneuronEx {
    @Test
	public void neuron() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Thread.sleep(5000);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@class,'subLink')]")).click();
		Set<String> allWindowHandle=driver.getWindowHandles();
	        for(String child:allWindowHandle)
	        {
	            
	            if(!child.equals(parent))
	            {
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("kru");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("kru@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("kru123");
		driver.findElement(By.xpath("//label[contains(text(),'DSA')]")).click();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
    }
}

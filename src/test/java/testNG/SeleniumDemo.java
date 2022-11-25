package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
	
	@Test
	public void Selenium()
	{
      ChromeDriver driver=new ChromeDriver();
      driver.get("http://www.google.com");
      driver.findElement(By.name("q")).sendKeys("Automation Testing");
      
      String title=driver.getTitle();
      System.out.println("Title is "+title);
      String url=driver.getCurrentUrl();
      System.out.println("Url is "+url);
     driver.quit();    
	}
	
//	EdgeDriver driver=new EdgeDriver();
//    driver.get("http://www.microsoftedge.com");
//    driver.findElement(By.name("q")).sendKeys("Automation Testing");
//    
//    String title=driver.getTitle();
//    System.out.println("Title is "+title);
//    String url=driver.getCurrentUrl();
//    System.out.println("Url is "+url);
//    driver.quit();    

}

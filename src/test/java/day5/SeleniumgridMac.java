package day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumgridMac 
{

WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName", "Safari");
		capabilities.setCapability("browserVersion", "16.0");
		capabilities.setCapability("os", "OS X");
		capabilities.setCapability("osVersion", "Ventura");
		
		URL url=null;
		try {
				url=new URL("https://kruthikar_xyrVYk:nGYf6oyQsjxFv4cxuFvB@hub-cloud.browserstack.com/wd/hub");
		}catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		driver=new RemoteWebDriver(url,capabilities);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void validCredentials()
	{
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//b[text()='Admin']")).isDisplayed(), true);
		//Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	}
	
}

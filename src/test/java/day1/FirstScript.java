package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {

	@Test
	public void firstScpt() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		//WebElement username =driver.findElement(By.name("email"));
		//username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("email1")).sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		// TODO Auto-generated method stub

	}

}

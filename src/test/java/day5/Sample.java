package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample 
{
  public void sample()
  {
  WebDriver driver=new ChromeDriver();
  driver.get("https://selectorshub.com/xpath-practice-page/");
}
}
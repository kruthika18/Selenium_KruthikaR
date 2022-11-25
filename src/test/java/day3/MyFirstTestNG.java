package day3;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MyFirstTestNG 
{
	@Test()
	public void login()
	{
		Assert.assertTrue(true);
		System.out.println("Login done");
	}
	@Test //(dependsOnMethods = "login")
	public void createAccount()
	{
		Assert.assertEquals(12, 12);
		
		System.out.println("Account Created");
	}
	@Test
	public void logout()
	{
		System.out.println("Successful logout");
	}
	
	

}

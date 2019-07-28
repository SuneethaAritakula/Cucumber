package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.loginPage;

public class TC_Login extends baseclass {
	
	loginPage Loginpage = new loginPage(driver);
		

	@Test
	public void loginTest()
	{
		driver.get(url);
		Loginpage.username(username);
		Loginpage.password(password);
		Loginpage.loginbutton();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			
				}
		else
		{
			Assert.assertFalse(false);
		}
	
}
	

}


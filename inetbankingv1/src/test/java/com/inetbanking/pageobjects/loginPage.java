package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	public loginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
@FindBy(name="uid")
WebElement txtUsername;

@FindBy(name="password")
WebElement txtPassword;

@FindBy(name = "btnLogin")
WebElement loginbutton;

public void username (String username)

{
	txtUsername.sendKeys(username);
}

public void password(String password)

{
txtPassword.sendKeys(password);	
}

public void loginbutton()
{
loginbutton.click();
	
}




	

}

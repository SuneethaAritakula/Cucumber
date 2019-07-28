package com.inetbanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass {
	
	public String url = "";
	public String username = "";
	public String password = "";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	
	{
 System.setProperty("webdriver.chrome.driver", "\\\\LPT01\\Users\\Administrator\\Desktop\\Cucumber\\inetbankingv1\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	}
	
	



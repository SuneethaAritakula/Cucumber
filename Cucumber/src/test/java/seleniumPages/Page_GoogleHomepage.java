package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Page_GoogleHomepage extends Page_BasePage{
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","\\\\LPT01\\Users\\Administrator\\Desktop\\Cucumber\\Cucumber\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public void openGoogleURL() {
		driver.get("http://www.google.com");
	}
	
	public void checkSearchBoxIsDisplayed() {
    if (driver.findElement(By.name("q")).isDisplayed()){
    	System.out.println("search box is displayed");
    }
    	else
    		{
    		System.out.println("search box is not displayed");
        }

				}
	
		
		public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("search button is displayed");
		}
		else {
			System.out.println("Search Button is not displayed");
		}
		}
	

		
		
		public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I am feeling lucky is displayed");
					}
		else {
			System.out.println("I am not feeling lucky is displayed");
		}
		
		}
		
	
		}
			

	
	
		
		



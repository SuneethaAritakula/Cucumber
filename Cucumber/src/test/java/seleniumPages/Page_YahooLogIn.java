package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_YahooLogIn extends Page_BasePage {
	
	public void yahoologinpage() {
	System.setProperty("webdriver.chrome.driver","\\\\LPT01\\Users\\Administrator\\Desktop\\Cucumber\\Cucumber\\driverFiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	}
	 
	public void verifyusernamefieldisavailable() {
		
		//<input class="phone-no " type="text" name="username" id="login-username" tabindex="1" value="suneethaaritakula" autocomplete="username" autocapitalize="none" autocorrect="off" autofocus="true" placeholder="Enter your&nbsp;email">
		if(driver.findElement(By.id("login-username")).isDisplayed()) {
			System.out.println("username field is displayed");
		}
			else {
				System.out.println("username field doesn't exist");
			}
	}
		
		public void verifynexttabisavailable() {
				
			if(driver.findElement(By.id("login-signin")).isDisplayed()) {
				
				System.out.println("Next tab is available");
			}
			else
			{
				System.out.println("Next tab isn't available");
			}
		}
			public void verifystaysignedincheckboxisavailable() {
			driver.findElement(By.xpath("//*[@id=\'login-username-form\']/p[2]/span[1]/label "));
			}
			
			public void verifytroublesigniningintextisavailable() {
				
				//<a href="/forgot" id="mbr-forgot-link">Trouble signing&nbsp;in?</a>
				if(driver.findElement(By.id("mbr-forgot-link")).isDisplayed())
				{
					System.out.println("trouble signing in text is displayed");
				}
				else {
					
								System.out.println("trouble signing in page is not displayed");
				}
							}
			
			public void verifycreateaccountatbisavailable() {
				
				if (driver.findElement(By.id("createacc")).isDisplayed())
				{
					System.out.println("create account tab is available");
				}
				else
				{
					System.out.println(" create account tab is not available");
				}
				}
			public void IamonYahoologinpage() {
				
			}
			
			public void Iinputusername() {
				driver.findElement(By.id("login-username")).sendKeys("suneethaaritakula@yahoo.com");
				
			}
			
			public void clickonnexttab() {
				driver.findElement(By.id("login-signin")).click();
			}
	
			  public void Iinputpassword() throws InterruptedException {
				  ////*[@id="login-passwd"]
				  Thread.sleep(1000);
				  driver.findElement(By.name("password")).sendKeys("Aparaj1tha");
			  }
			  
			  public void clickonsignintab(){
				  driver.findElement(By.id("login-signin")).click();
			  }
			  
			  public void checksuccessfulsignin() {
				  String expected_Url = " https://uk.yahoo.com/?p=us";
				  String actual_currentUrl = driver.getCurrentUrl();
				  if (actual_currentUrl.contains(expected_Url))
				  
				  {
					  System.out.println("Url matched - Passed");
				  }
				  else
				  {
					  System.out.println("url didn't match - Failed");
				  }
			  }

}

		






		
		
	
	
	
	
	
	



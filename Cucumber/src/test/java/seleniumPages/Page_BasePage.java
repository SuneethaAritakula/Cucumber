package seleniumPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_BasePage {
	public static WebDriver driver;
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver","\\\\LPT01\\Users\\Administrator\\Desktop\\Cucumber\\Cucumber\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	}
	
	
}

package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_Yahoomainpage extends Page_BasePage {
	
		
	
	public void Page_YahooLogIn() {
		
		
	}
	
	
	public void verifynameisdisplayed() throws InterruptedException     {
		
		////*[@id="ybar"]/div[3]/div[1]/div/label/span
		
		
		//<span class="D(ib) Maw(100px) Ov(h) Whs(nw) Tov(e) Lh($userNavTextLh) Pstart(8px) Fz(14px) Fw(b) Va(t) ua-ie7_D(n) C(#4d00ae)" id="yui_3_18_0_3_1560975276709_798">Suneetha</span>
		//*[@id="ybar"]/div[3]/div[1]/div/label/span
		driver.findElement(By.xpath("//*[@id='ybar']/div[3]/div[1]/div/label/span")).click();
		Thread.sleep(6000);
		
		

	}
	
	
	public void mouseover() {
		
		WebElement Suneetha = driver.findElement(By.xpath("//*[@id=\\'yui_3_18_0_3_1560541402905_783\\']"));
		Actions Act = new Actions(driver);
		////*[@id="yui_3_18_0_3_1560541402905_783"]
		//*[@id="yui_3_18_0_3_1560457801500_766"]
		Act.moveToElement(Suneetha).perform();
		//"uh-settings"
		driver.findElement(By.id("uh-settings")).click();
		
			}
	public void usernameandemailaddressdisplayed() {
		
	}
	
	public void accountinfolinkisdisplayed() {
		
	}
	
	public void Iclickonthislink() {
		
	}
	public void personalinfodisplayed() {
		
	}
	}




package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_GoogleHomepage;

public class googleHomePage {
	
	Page_GoogleHomepage googleHomePage = new Page_GoogleHomepage();
		
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Exception{
	googleHomePage.launchBrowser();
				    
	}


	@When("^I open Google home page$")
	public void i_open_Google_home_page() throws Exception {
		googleHomePage.openGoogleURL();
	   
	}

	@Then("^I verify the page displays search text box$")
	public void i_verify_the_page_displays_search_text_box() throws Exception {
		googleHomePage.checkSearchBoxIsDisplayed();
	    
	}

	@And("^the page displays Google search button$")
	public void the_page_displays_Google_search_button() throws Exception {
	googleHomePage.checkGoogleSearchButtonIsDisplayed();
	}
	
	@And("^the page displays I am feeling lucky button$")
	public void the_page_displays_I_am_feeling_lucky_button() throws Exception{
		googleHomePage.checkImFeelingLuckyButtonIsDisplayed();
		
	    
	}

	
	}





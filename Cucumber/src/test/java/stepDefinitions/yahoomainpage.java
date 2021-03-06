package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_Yahoomainpage;

public class yahoomainpage {
	
	Page_Yahoomainpage yahoomainpage = new Page_Yahoomainpage();
	
	@Given("^I am logged into my Yahoo account$")
	public void I_am_logged_into_my_Yahoo_account()  {
		yahoomainpage.Page_YahooLogIn();
		
}

	@Given("^I verify my name is displayed$")
	public void I_verify_my_name_is_displayed() throws InterruptedException   {
	yahoomainpage.verifynameisdisplayed();
	    
	}

	@When("^I hover the mouse over this icon$")
	public void i_hover_the_mouse_over_this_icon() {
    yahoomainpage.mouseover();
	}

	@Then("^my Username and email address is displayed$")
	public void my_Username_and_email_address_is_displayed() {
	    yahoomainpage.usernameandemailaddressdisplayed();
	    
	}

	@Then("^Account info link is enabled$")
	public void account_info_link_is_enabled() {
	    yahoomainpage.accountinfolinkisdisplayed();
	}

	@When("^I click on this link$")
	public void i_click_on_this_link() {
	yahoomainpage.Iclickonthislink();
	}

	@Then("^My Personal Info is displayed$")
	public void my_Personal_Info_is_displayed() {
	    yahoomainpage.personalinfodisplayed();
	}


}

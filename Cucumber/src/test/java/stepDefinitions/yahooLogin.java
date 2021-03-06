package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_YahooLogIn;

public class yahooLogin {
	
	Page_YahooLogIn yahooLogin = new Page_YahooLogIn();
	
	public void setup(){
	}
	
		
	@Given("^I navigate to Yahoo Log in page$")
	public void i_navigate_to_Yahoo_Log_in_page() throws Exception{
		yahooLogin.yahoologinpage();
	}
    
    	

	@When("^I verify username field is available$")
	public void i_verify_username_field_is_available() throws Exception {
	  yahooLogin.verifyusernamefieldisavailable();
	   
	}

	@Then("^I verify next tab is available$")
	public void i_verify_next_tab_is_available() throws Exception{
		yahooLogin.verifynexttabisavailable();
	  
	}

	@Then("^I verify stay signed in check box is available$")
	public void i_verify_stay_signed_in_check_box_is_available() throws Exception{
	  yahooLogin.verifystaysignedincheckboxisavailable();
	}

	@Then("^I verify Trouble Signing in text is available$")
	public void i_verify_Trouble_Signing_in_text_is_available() throws Exception {
	    yahooLogin.verifytroublesigniningintextisavailable();;
	}

	@Then("^I verify create account atb is available$")
	public void i_verify_create_account_atb_is_available() throws Exception{
	   yahooLogin.verifycreateaccountatbisavailable();
	}

	@Given("^I am on Yahoo log in page$")
	public void i_am_on_Yahoo_log_in_page() throws Exception{
	yahooLogin.IamonYahoologinpage();
	}

	@When("^I input Username$")
	public void I_input_Username() throws Exception{
	yahooLogin.Iinputusername();
	}

	@When("^click on next tab$")
	public void click_on_next_tab() throws Exception {
	 yahooLogin.clickonnexttab();;
	}

	@Then("^I input password$")
	public void i_input_password() throws Exception {
	 yahooLogin.Iinputpassword();
	}

	@Then("^click on sign in tab$")
	public void click_on_sign_in_tab() throws Exception {
		yahooLogin.clickonsignintab();

	}

	@Then("^I should be able to successfully login$")
	public void i_should_be_able_to_successfully_login() throws Exception{
	    yahooLogin.checksuccessfulsignin();
	    
	    
	}
	
}


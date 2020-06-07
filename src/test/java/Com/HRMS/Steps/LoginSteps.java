package Com.HRMS.Steps;

import org.junit.Assert;

import Com.hrmsCucmbr.Utils.CommonMethods;
import Com.hrmsCucmbr.Utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  extends CommonMethods{


//	@Given("user is logged with valid admin credentials")
//	public void user_is_logged_with_valid_admin_credentials() {
//	  sendText(login.username, ConfigsReader.getProperty("username"));
//	  sendText(login.password, ConfigsReader.getProperty("password"));
//	  click(login.loginBtn);
//	}

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
	 sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  click(login.loginBtn);
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct ",expected,actual  );
		System.out.println(actual);
	}

	@When("user enter valid ess username and password")
	public void user_enter_valid_ess_username_and_password() {
		
		  sendText(login.username, "Gince123");
		  sendText(login.password,"SyntaxHrm123!");
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected = "Welcome Gince123";
		String actual = dashboard.welcomeuser.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct ",expected,actual);
	
	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		 sendText(login.username, "Gince123");
		 sendText(login.password, "Syntax123.....");
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
	    
	}
}

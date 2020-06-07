package Com.HRMS.Steps;
import org.junit.Assert;
import Com.hrmsCucmbr.Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalidloginTest extends CommonMethods {
	@Given("user entered invalid admin credentials")
	public void user_entered_invalid_admin_credentials() {
	   sendText(login.username,"Arzu");
	   sendText(login.password,"Ar@123");
	}
	@When("user click login button")
	public void user_click_login_button() {
		jsClick(login.loginBtn);
	}
	@Then("user see error massage")
	public void user_see_error_massage() {
		String expectederrmasage="Invalid credentials";
		String actualerrMasage=login.errorMsg.getText();
		Assert.assertEquals("Error message did not match", expectederrmasage, actualerrMasage);
		wait(2);
	}
	@Then("user close the browser")
	public void user_close_the_browser() {
	   tearDown();
	}
	
}

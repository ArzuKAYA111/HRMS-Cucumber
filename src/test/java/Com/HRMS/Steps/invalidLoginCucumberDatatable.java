package Com.HRMS.Steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Com.HRMS.testbase.BaseClass;
import Com.hrmsCucmbr.Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class invalidLoginCucumberDatatable extends  CommonMethods{
	
	
	@When("User enter invalid {string} , {string} and see {string}")
	public void user_enter_invalid_and_and_see(String UserName, String Password, String ErrorMessage) {
	    
		 login.login(UserName, Password);
		
		   String expected = ErrorMessage;
			String actual=login.errorMsg.getText();
			Assert.assertEquals("Error message did not match",expected, actual);
			wait(2);
}

@When("User enter invalid username and password  and see error message")
public void user_enter_invalid_username_and_password_and_see_error_message(DataTable dataTable) {
	
	    List<Map<String ,String>> credantials =dataTable.asMaps();
	    
     for(Map<String ,String> credantial:credantials) {
	   login.login(credantial.get("UserName"), credantial.get("Password"));
	   String expected=credantial.get("ErrorMessage");
		String actual=login.errorMsg.getText();
		Assert.assertEquals("Error message did not match",expected, actual);
         wait(3);
		
		
 }  

   
}

	

}
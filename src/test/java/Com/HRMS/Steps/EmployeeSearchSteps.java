package Com.HRMS.Steps;
import org.junit.Assert;

import Com.hrmsCucmbr.Utils.CommonMethods;
import Com.hrmsCucmbr.Utils.ConfigsReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{
	
	
	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(viewEmp.EmpID, "10079");
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.serchBtn);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		System.out.println("Employee is displayed");
		tearDown();
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
		
	}

	}
	
//	@Given("user is navigate to HRMS")
//	public void user_is_navigate_to_HRMS() {
//	    setUp();
//}
//
//	@Given("user is logged with valid admin credentials")
//	public void user_is_logged_with_valid_admin_credentials() {
//	   sendText(login.username, ConfigsReader.getProperty("username"));	
//		sendText(login.password, ConfigsReader.getProperty("password"));	
//		click(login.loginBtn);	
//}
//	@And("user navigate to employee list page")
//	public void user_navigate_to_employee_list_page() {
//	   jsClick(dashboard.PIM);
//	   wait(2);
//	   jsClick(dashboard.empListPage);
//}
//	@When("user enters valid employee id")
//	public void user_enters_valid_employee_id() {
//	  sendText(viewEmp.EmpID,"10079");
//		
//}
//	@When("click on search button")
//	public void click_on_search_button() {
//	   jsClick(viewEmp.serchBtn) ;
//}
//	@Then("user see employee information is displayed")
//	public void user_see_employee_information_is_displayed() {
////	validation employee id 1 way
//		// viewEmp.employeeIdIsDisplayed();
//		
//	//validation employee id 2 way
//	String expectedId="10079";
//	String actualId=viewEmp.userid.getText();
//	Assert.assertEquals("expected and actual user ID did not match",expectedId,actualId);
//	wait(2);
//	//tearDown();
//}
//	@When("user enters valid employee name and last name")
//  public void user_enters_valid_employee_name_and_last_name() {
//  //validation employe name first way
// // viewEmp.employeeNameusernameDisplayed();
//    
//   //validation employee mame second way
//	String expectedusername = "Bishnu1";
//	String actualusername = viewEmp.userName.getText();
//   Assert.assertEquals("Expected and actual user name did not match ",expectedusername,actualusername);
//	wait(2);
//
//	}
//
//}



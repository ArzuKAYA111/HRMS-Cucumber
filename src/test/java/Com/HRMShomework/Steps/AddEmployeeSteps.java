package Com.HRMShomework.Steps;
//package Com.HRMS.Steps;
//
//import org.junit.Assert;
//import Com.hrmsCucmbr.Utils.CommonMethods;
//import Com.hrmsCucmbr.Utils.ConfigsReader;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class AddEmployeeSteps extends CommonMethods{
//	
//	@Given("user logged in into HRMS")
//	public void user_logged_in_into_HRMS() {
//	   
//	login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
//	dashboard.navigateToAddEmployee();
//		
//	}
//	
//	@When("user enters employees first name and last name")
//	public void user_enters_employees_first_name_and_last_name() {
//	   
//		addEmp.sendCredantials("Adem", "Ahmet","Aydin");
//		
//	}
//
//	@When("user clicks save button")
//	public void user_clicks_save_button() {
//		addEmp.BtnSave.click(); 
//		wait(2);
//		
//	}
//
//	@Then("employee is added successfully")
//	public void employee_is_added_successfully() {
//	   
//	String actual=	pdetails.profilname.getText();
//	String expected="Adem Ahmet Aydin";
//	Assert.assertEquals("Name did not match",expected, actual);
//	
//	}
//
//	@When("user deletes employee id")
//	public void user_deletes_employee_id() {
//		addEmp.empid.clear();
//		
//		
//	}
//
//	@When("user clicks on create login checkbox")
//	public void user_clicks_on_create_login_checkbox() {
//		jsClick(addEmp.loginDetls);
//		
//	}
//
//	@When("user enters  login credentials")
//	public void user_enters_login_credentials() {
//		addEmp.createloginDetails("Ahmet_Adem_Aydin", "Ademm@AydinU2_@34");  
//		wait(2);
//		
//	}
//
//}

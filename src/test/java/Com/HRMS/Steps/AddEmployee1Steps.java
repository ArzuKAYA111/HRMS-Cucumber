package Com.HRMS.Steps;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import Com.hrmsCucmbr.Utils.CommonMethods;
import Com.hrmsCucmbr.Utils.Constants;
import Com.hrmsCucmbr.Utils.ExcelUtility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee1Steps extends CommonMethods {

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}

	// this method has hardcoded values
	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
		sendText(addEmp.empfirstnme, "Jhames");
		sendText(addEmp.lastnme, "Ssmith");
	}

	// this method is enhanced method and parameter values are supplied from Featute File
	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmp.empfirstnme, firstName);
		sendText(addEmp.lastnme, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmp.BtnSave);
	}

	// this method has hardcoded values
	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		String actual = pdetails.profilname.getText();
		String expectedName = "Jhames Ssmith";
		Assert.assertEquals(expectedName, actual);
	}

	// this method is enhanced method and parameter values are supplied from FF
	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String expectedName) {
		String actual = pdetails.profilname.getText();
		Assert.assertEquals(expectedName, actual);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.empid.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		jsClick(addEmp.loginDetls);
	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		addEmp.createloginDetails("Jhames_Smiths_", "Jhames_123_@John_");  

	}

	@When("user enter employees {string}, {string} and {string}")
	public void enteringEmployee(String fName, String mName, String lName) {
		sendText(addEmp.empfirstnme, fName);
		sendText(addEmp.midlname, mName);
		sendText(addEmp.lastnme, lName);
	}

	@Then("{string}, {string} and {string} is added successfully")
	public void and_is_added_successfully(String fname, String middleName, String laName) {
		System.out.println("I added the employee !!!!!!!!!!!!!!!!!!!!!!!");
		wait(2);
	}

	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {//import data table as i.o cucumber datatable.DataTable
		List<Map<String, String>> addEmployeeList=dataTable.asMaps();
		
		for(Map<String, String> map:addEmployeeList) {
			
			String fname=map.get("FirstName");
			String mname=map.get("MiddleName");
			String lname=map.get("LastName");
			
			sendText(addEmp.empfirstnme, fname);
			sendText(addEmp.midlname, mname);
			sendText(addEmp.lastnme, lname);
			click(addEmp.BtnSave);
			//adding assertion
			
			String actual=pdetails.profilname.getText();
			String expected=fname+" "+mname+" "+lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addemp);
			wait(5);
		}
	}
	
	@Then("employee is added")
	public void employee_is_added() {
		System.out.println("-----Employee is added using datatable");
	}
	
	
	@When("user enters employee data from {string} excel sheet then employee is added")
	public void user_enters_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {// we wrote sheetName (addEmployeeData) in feature file this method gets from there 
	   List<Map<String, String>> excelList=ExcelUtility.excelIntoListOfMaps(Constants.TESTDATA_FILEPATH, sheetName);
// HW

	for(Map<String, String> data:excelList) {
		String fname=data.get("FirstName");
		String mname=data.get("MiddleName");
		String lname=data.get("LastName");
		
		sendText(addEmp.empfirstnme, fname);
		sendText(addEmp.midlname, mname);
		sendText(addEmp.lastnme, lname);
		click(addEmp.BtnSave);
		

		
		String actual=pdetails.profilname.getText();
		String expected=fname+" "+mname+" "+lname;
		Assert.assertEquals("Employee is not addedd successfully", expected, actual);
		jsClick(dashboard.addemp);
		
	}	   
	   
}
	
	
	
	
	
	
	
	
}
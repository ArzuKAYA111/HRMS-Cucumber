package Com.HRMS.Steps;

import java.util.List;
import java.util.Map;

import Com.hrmsCucmbr.Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIvsDatabaseValidation extends CommonMethods  {

	@Given("user is on employee list page")
	public void user_is_on_employee_list_page() {
		//WebDriver driver = new PhantomJSDriver();
		
	}

	@When("user retrieve all data from the ui")
	public void user_retrieve_all_data_from_the_ui() {
	  System.out.println("User retrieves values from ui table");
	}

	@When("user retrieves all the data from database using below query")
	public void user_retrieves_all_the_data_from_database_using_below_query(DataTable query) {
	   System.out.println(query.asList().get(0));
	}

	@Then("user compare both data and it should match.")
	public void user_compare_both_data_and_it_should_match() {

	}

	@Then("user logs out")
	public void user_logs_out() {
	 
	}
	
	@Given("user validates that drop down contains following values")
	public void user_validates_that_drop_down_contains_following_values(List<String> ddVal) {
		
		for (int i = 0; i < ddVal.size(); i++) {
			System.out.println(ddVal.get(i));
		}	
	}
	
	
	@Then("user enters following data set")
	public void user_enters_following_data_set(DataTable data) {
		System.out.println(data.asList().get(0));
		System.out.println(data.asList().get(1));
	}
	
	@Then("user click on add employee page")
	public void user_click_on_add_employee_page() {

	}

	@Then("user add the following employees \"<FirstName>\"and \"<MiddleName>\"and\"<LastName>\"and click on save btn")
	public void user_add_the_following_employees_FirstName_and_MiddleName_and_LastName_and_click_on_save_btn(DataTable dTable) {	   
	
		for(Map<String, String> data : dTable.asMaps()) {
			System.out.println(data.get("FirstName"));
			
			System.out.println(data.get("MiddleName"));
			System.out.println(data.get("LastName"));
		}
	
	}
	
	

}

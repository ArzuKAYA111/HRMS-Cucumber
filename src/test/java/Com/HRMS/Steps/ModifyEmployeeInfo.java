package Com.HRMS.Steps;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Com.hrmsCucmbr.Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyEmployeeInfo extends CommonMethods {

	
	@When("admin navigate to Employee Information page")
	public void admin_navigate_to_Employee_Information_page() {
		dashboard.navigateToEmployeeList();
		wait(2);
	}

	@Given("admin searches employee by name")
	public void admin_searches_employee_by_name() {
		viewEmp.EmpName.sendKeys("Zehra Fatma Gulec",Keys.ENTER);
		wait(6);
		
		jsClick(viewEmp.serchBtn);
	}

	@Given("admin select employee from the list")
	public void admin_select_employee_from_the_list() {
	   jsClick(viewEmp.userName);
	}

	@Given("admin navigate to Personal Deatils page and click to Edit")
	public void admin_navigate_to_Personal_Deatils_page_and_click_to_Edit() {
		pdetails.EditSaveBtn.click();
		
		wait(2);
		
	}

	@Then("admin add new information and save")
	public void admin_add_new_information_and_save(DataTable dataTable, Type String) {
	       
		Map<String ,String> map= dataTable.asMap(String , String );   
		
		
		
		
		
		
		
		
		
		
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

	}

//	@Given("admin searches employee by ID")
//	public void admin_searches_employee_by_ID() {
//	  
//	}

	
}






































//Simple calendar handling 

//Navigate to leave list
//CommonMethods.WaitForClickability(driver.findElement(By.linkText("Leave")));
//driver.findElement(By.linkText("Leave")).click();
//driver.findElement(By.linkText("Leave List")).click();
//
////click on the calendar 
//WebElement ele=CommonMethods.WaitForClickability(driver.findElement(By.id("calFromDate")));
//ele.click();
//
//WebElement mDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//CommonMethods.selectDdValue(mDD, "Apr");
//
//WebElement yDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
//CommonMethods.selectDdValue(yDD, "2021");
//
////select day from the calendar// defined the calendar
//List<WebElement> fromDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
//
//for(WebElement fromDay: fromDate) {
//	Thread.sleep(200);
//	if(fromDay.getText().equals("15")) {
//		fromDay.click();
//		break;
//	}
//}


////Dynemic table handling

//String expectValue = "Bob Feather";
//
////List of all rows
//List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
//
//for (int i = 1; i < rows.size(); i++) {
//
//	String rowText=rows.get(i-1).getText();//get text of each row excluding header.
//	
//	if(rowText.contains(expectValue)) {//validating expected Value
//		//loop through each row by providing the index in the xpath and click on it.
//		driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();;
//		break;
//	}	
//}
//
//Thread.sleep(5000);
//driver.close();
//
//}

package Com.HRMS.Steps;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
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
		wait(3);
	}
	@Given("admin searches employee by full name {string}")
	public void admin_searches_employee_by_full_name(String string) {
		viewEmp.EmpName.sendKeys(string,Keys.ENTER);
		wait(3);
		
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
      	// first Way
//	@Then("admin add new information and save")
//	public void admin_add_new_information_and_save(DataTable userInfo) {
//	    
//	List<Map<String,String>> data = userInfo.asMaps(String.class,String.class);
//		
//	sendText(pdetails.empOtherId,data.get(0).get("OtherId"));
//	sendText(pdetails.dateofBirthLine,data.get(0).get("DateOfBirth"));	
//	sendText(pdetails.miltaryserv,data.get(0).get("MilitaryService"));
//	sendText(pdetails.nickname,data.get(0).get("NickName"));
//	sendText(pdetails.SSNno,data.get(0).get("ssnNo"));
//	sendText(pdetails.SINno,data.get(0).get("SinNo"));
//	
//	pdetails.selectInfo("Married" ,"Turkish" );
//	wait(2);
//	pdetails.ChangeLicExpDate("Jun","20","2021");
//	wait(5);
//	pdetails.SmokerCheckbox.click();
//	pdetails.EditSaveBtn.click();
//	wait(2);	
//	}
//	@Given("admin searches employee by ID {string}")
//	public void admin_searches_employee_by_ID(String string) {
//		viewEmp.EmpID.sendKeys(string,Keys.ENTER);
//		wait(2);
//	jsClick(viewEmp.serchBtn); 
//}
	// second way 	
	
	@Then("admin add new information and save")
	public void admin_add_new_information_and_save(DataTable userInfo) {
	
		List<Map<String, String>> modifyEmployeeList=userInfo.asMaps();
		
		for(Map<String, String> data:modifyEmployeeList) {
			String Oid=data.get("OtherId");
			String datebirth=data.get("DateOfBirth");
			String nickN=data.get("NickName");
			String MilServ=data.get("MilitaryService");
			String ssnNo=data.get("ssnNo");
			String SINno=data.get("SinNo");
			
			
			sendText(pdetails.empOtherId, Oid);
			sendText(pdetails.dateofBirthLine, datebirth);
			sendText(pdetails.nickname, nickN);
			sendText(pdetails.miltaryserv, MilServ);
			sendText(pdetails.SSNno, ssnNo);
			sendText(pdetails.SINno, SINno);
			click(addEmp.BtnSave);
	
	
	
	
	
	
		}
	
}}



//Simple calendar handling 

////Navigate to leave list
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
//for(WebElement date: pdetails.datenumber) {
//	Thread.sleep(200);
//	if(date.getText().equals("15")) {
//		date.click();
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

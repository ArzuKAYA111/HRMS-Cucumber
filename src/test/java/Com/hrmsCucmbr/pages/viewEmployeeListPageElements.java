package Com.hrmsCucmbr.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.testbase.BaseClass;
import Com.hrmsCucmbr.Utils.CommonMethods;

public class viewEmployeeListPageElements extends CommonMethods{

	@FindBy (id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy (id="empsearch_id")
	public WebElement EmpID;
	
@FindBy(xpath="//select[@id='empsearch_employee_status']")
public List<WebElement> EplymntStatus;

@FindBy(xpath="//select[@id='empsearch_termination']")
public List<WebElement > include;

	@FindBy (id="searchBtn")
	public WebElement serchBtn;
	
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr")
	public List<WebElement> emplListRows;
	
	@FindBy (xpath="//table[@id='resultTable']/tbody/tr/td")
	public List<WebElement> emplListcolums;
	
	@FindBy(xpath="//table[@id='resultTable']//td[2]/a")
	public WebElement userid;
	
	@FindBy(xpath="//table[@id='resultTable']//td[3]/a")
	public WebElement userName;

	@FindBy(xpath="//table[@id='resultTable']")
	public WebElement EmployeesTable;
	
	@FindBy(xpath="//table[@id='resultTable']//td[3]/a")
	public WebElement tableFirstName;
	
	//for  SQL Name validation against DB
	@FindBy(xpath="//table[@id='resultTable']//tbody//tr//td[3]")
	public List<WebElement> tableFirstName_1; // bubu list yaptik cunku db table dan ismi list of map type return yapiyoruz 

	
	//for  SQL Name validation against DB
	/**
	 * this method will check if employee table is displayed
	 * @return
	 */
	public boolean isTableDisplayed() {
		return EmployeesTable.isDisplayed();
	}
	//for  SQL Name validation against DB
	public List<Map<String,String>> getFirstNameFromTable(){
		List<Map<String,String>> uiName=new ArrayList();
				for( WebElement row:tableFirstName_1 ) {
					Map<String,String> storeUiNames=new LinkedHashMap<>();
					String tableName=row.getText();// if our employee has middle name we need to manipulate this code
					 tableName=tableName.replaceAll("\\s.*","").trim(); // This will work for every employee
					                                                   //replaceAll("\\s.*","").trim() It replaces everything with nothing after 1st space 
					storeUiNames.put("emp_firstname", tableName);
					uiName.add(storeUiNames);
				}
		return uiName;
		}
	
	
	//for  SQL Last Name validation against DB
		@FindBy(xpath="//table[@id='resultTable']//tbody//tr//td[4]")
		public List<WebElement> tableLastname; // bubu list yaptik cunku db table dan ismi list of map type return yapiyoruz 
	
		public List<Map<String,String>> getLastNameFromTable(){
			List<Map<String,String>> uiLastname= new ArrayList<>();
			for(WebElement row:tableLastname) {
				Map<String,String> storeuiLastname= new LinkedHashMap<>();
				String TableName =row.getText();
				storeuiLastname.put("emp_lastname", TableName);
				uiLastname.add(storeuiLastname);
			}
			
			return uiLastname;
	}
	
	
	public void employeeIdIsDisplayed() {
		System.out.println("The user ID is : "+ userid.isDisplayed());
	}
public	viewEmployeeListPageElements(){
		
	PageFactory.initElements(BaseClass.driver, this);
	
	

}

public  void employeeNameusernameDisplayed() {
	System.out.println("The user NAME is : "+ userName.isDisplayed());
}















































//public void handlingTable(List<WebElement> rows ,List<WebElement> cols ) {
//	
//
//	for (int i = 1; i <= rows.size(); i++) {
//		for (int j = 1; j <= cols.size(); j++) {
//			WebElement cellData = driver.findElement(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr[" + i + "]/td[" + j + "]"));
//			String cellDataText = cellData.getText();
//			//System.out.println(cellDataText);
//			
//			if(j == 2) {
//				System.out.println("colmnTwo.."+cellDataText);
//			}
//		}
//		System.out.println("....");
//	}
//	}







}

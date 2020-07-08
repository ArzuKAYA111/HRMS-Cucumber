package Com.hrmsCucmbr.pages;

import java.util.List;

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

	
public	viewEmployeeListPageElements(){
		
	PageFactory.initElements(BaseClass.driver, this);
	
	}
	
public void employeeIdIsDisplayed() {
	System.out.println("The user ID is : "+ userid.isDisplayed());
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

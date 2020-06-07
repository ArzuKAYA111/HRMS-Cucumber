package Com.hrmsCucmbr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.testbase.BaseClass;

public class viewEmployeeListPageElements {

	@FindBy (id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy (id="empsearch_id")
	public WebElement EmpID;
	

	@FindBy (id="searchBtn")
	public WebElement serchBtn;
	
	
	@FindBy (xpath="//table[@id='resultTable']/thead/tr")
	public WebElement emplListRows;
	

	
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



}

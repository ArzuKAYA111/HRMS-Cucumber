package Com.hrmsCucmbr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.testbase.BaseClass;
import Com.hrmsCucmbr.Utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods{
	@FindBy(id="firstName")
	public WebElement empfirstnme;
	
	@FindBy(id="middleName")
	public WebElement midlname;
	
	@FindBy(id="lastName")
	public WebElement lastnme;
	
	@FindBy(id="employeeId")
	public WebElement empid;
	
	@FindBy (id="photofile")
	public WebElement chooseFile;
	
	@FindBy(id="chkLogin")
	public WebElement loginDetls;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement userpassword;
	
	@FindBy(id="re_password")
	public WebElement reuserpassword;
	
	@FindBy(xpath="//span[text()='Passwords do not match']")
	public WebElement passwordErrmsg; 
	
	@FindBy(id="btnSave")
	public WebElement BtnSave;
	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	public void sendCredantials( String name, String Midname, String Lname) {// for send first ,middle ,last
		sendText(empfirstnme,name);
		sendText(midlname,Midname);
		sendText(lastnme,Lname);
	
	}

	public void sendCredantials1( String name,String Lname) {// for enter name last name
		sendText(empfirstnme,name);
		sendText(lastnme,Lname);
	
	}
	public void createloginDetails( String Username, String Password) {
		sendText(username, Username);
		sendText(userpassword,Password);
		sendText(reuserpassword,Password);
	}
	
	
}

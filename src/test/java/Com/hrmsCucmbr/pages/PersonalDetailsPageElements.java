package Com.hrmsCucmbr.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.testbase.BaseClass;
import Com.hrmsCucmbr.Utils.CommonMethods;


public class PersonalDetailsPageElements extends CommonMethods{
	
	@FindBy(id="btnSave")
	public WebElement  EditSaveBtn;
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstname;
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement  midname ;
	
	@FindBy(id= "personal_txtEmpLastName")
	public WebElement lasstname;
	
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	public List<WebElement >  nationalityDD    ;
	
	
	
	@FindBy(xpath="//ul[@class='radio_list']/li ")
	public List<WebElement>   genderlist    ;
	
	
	@FindBy(name ="personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	
	
	@FindBy(xpath="//ul[@class='radio_list']/li[1]/input")
	public WebElement   maleBtn    ;
	
	@FindBy(xpath="//ul[@class='radio_list']/li[2]/input")
	public WebElement   femaleBtn    ;
	
	
	
	@FindBy(xpath ="//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;
	
	@FindBy(id ="personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement   empOtherId     ;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement   drivlisNO    ;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement   SSNno    ;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement   SINno   ;
	@FindBy(xpath="//select[@id='personal_cmbMarital']")
	public WebElement   maritalStatus    ;
	
	
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement licExpDateSendKeys;
	
	@FindBy(xpath="//input[@id='personal_txtLicExpDate']/following-sibling::img")// calendar
	public WebElement licExpDate ;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")// calendar
	public List<WebElement>   selctmonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")// calendar
	public List<WebElement>  selctyear;
	
	@FindBy(xpath="//a[@title='Next']")// calendar
	public WebElement   nextBtn;
	
	@FindBy(xpath="//a[@title='Prev']")// calendar
	public WebElement   previousBtn ;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/thead/tr/th")// calendar/ datys (Monday ,...)
	public List<WebElement >  dayNames;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr")// date number rows 
	public WebElement   dateRows ;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")// date number colums
	public WebElement   datecolums;
	
	@FindBy(id="personal_DOB")
	public WebElement  dateofBirthLine;   
	
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement   nickname;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement   SmokerCheckbox ;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement   miltaryserv ;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement profilname;
	
	@FindBy(xpath="//ul[@id='sidenav']/li")
	public List<WebElement >    persDetailDD    ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	
	}
}
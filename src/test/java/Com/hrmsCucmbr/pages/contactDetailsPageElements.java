package Com.hrmsCucmbr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.hrmsCucmbr.Utils.CommonMethods;

public class contactDetailsPageElements extends CommonMethods {

	@FindBy(id = "btnSave")
	public WebElement EditSaveBtn;

	@FindBy(id = "contact_street1")
	public WebElement addStr1;

	@FindBy(id = "contact_street2")
	public WebElement addStr2;

	@FindBy(id = "contact_city")
	public WebElement City;

	@FindBy(xpath = "//select[@id='contact_state']")
	public WebElement selcState;

	@FindBy(id ="contact_emp_zipcode")
	public WebElement ZipCode;

	@FindBy(xpath = "//select[@id='contact_country']")
	public WebElement selcCountry;

	@FindBy(id = "contact_emp_hm_telephone")
	public WebElement homeTel;

	@FindBy(id = "contact_emp_mobile")
	public WebElement Mobil;

	@FindBy(id = "contact_emp_work_telephone")
	public WebElement WorkTel;

	@FindBy(id = "contact_emp_work_email")
	public WebElement Workmail;

	@FindBy(id = "contact_emp_oth_email")
	public WebElement othermail;

	public contactDetailsPageElements() {
		PageFactory.initElements(driver, this);

	}

}

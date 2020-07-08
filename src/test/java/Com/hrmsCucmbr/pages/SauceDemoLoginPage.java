package Com.hrmsCucmbr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.HRMS.testbase.BaseClass;

public class SauceDemoLoginPage {
	@FindBy (id="user-name")
	public WebElement userName;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (xpath="//input [@value='LOGIN']")
	public WebElement LoginBTN;
	
	@FindBy (xpath="//div [text()='Products']")
	public WebElement productLogo;
	
	@FindBy (xpath="//h3 [@data-test='error']")
	public WebElement errorMEssage;
	
	
	public SauceDemoLoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}


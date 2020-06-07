package Com.hrmsCucmbr.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.hrmsCucmbr.Utils.CommonMethods;


public class LoginPageElements extends CommonMethods{// page foctory li olani (bu class i)extend yapmamizin nedeni burada elementlere common 
	                                                  //methodslari kullanarak bazi operations yapabilmemiz.
	
	// Elementleri page factory kullanmadan bir class ta tanimlar ve depolarsak o class i extend yapmamiz gerekir 
	// Not using PageFactory, You have to extend CommonMethods or BaseClass
	// public WebElement username2=driver.findElement(By.id("txtUsername")); // Example of POM Witout Page factory
	
	 
	// Using PageFactory and @FindBy Annotation normally do not need extend from any class but to make some operation on elements in that class we can extend
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;            
                                          // at that part we create elements (instance variables) but we do not initialize theme
	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']/img")
	public WebElement logo;

	@FindBy(id ="spanMessage")
	public WebElement errorMsg;

	public LoginPageElements() { // To initialize those elements we use  constructor and pageFactory class and initElements method
		                         //When we call the that constructor into any class we initialze those elements
		
		PageFactory.initElements(driver, this);
	}
	
	//if we would be keeping elements as private 
		//then we will need to create public getters and setters 
		//so we can access page elements from test classes
	
	//Setter
	public void sendUsername(String usename) {
		sendText(username, usename);
	}
	
	// Getter
	
	public WebElement getUsername() {
		return username;
	}
	
	public void login(String uid , String pwd) {
		sendText(username ,uid);
		sendText (password, pwd);
		click(loginBtn);
	}


		
	}
	
	
	
	
	


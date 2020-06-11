package Com.HRMS.testbase;

import Com.hrmsCucmbr.pages.AddEmployeePageElements;
import Com.hrmsCucmbr.pages.DashBoardPageElements;
import Com.hrmsCucmbr.pages.LoginPageElements;
import Com.hrmsCucmbr.pages.PersonalDetailsPageElements;
import Com.hrmsCucmbr.pages.contactDetailsPageElements;
import Com.hrmsCucmbr.pages.viewEmployeeListPageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pdetails;
    public static viewEmployeeListPageElements viewEmp ;
    public static contactDetailsPageElements contDetail;

	public static void initialize() {
	 login=new LoginPageElements();
	 dashboard=new DashBoardPageElements();     //we are calling the constructor of page calsses
	 addEmp= new AddEmployeePageElements();
	 pdetails= new PersonalDetailsPageElements();
	 viewEmp=new viewEmployeeListPageElements();
	 contDetail= new contactDetailsPageElements();
	 
	 
	 
	 
	}
	
	
	
	
	
	
	
	
}

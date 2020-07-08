package Com.HRMS.Steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Com.hrmsCucmbr.Utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboaredSteps extends CommonMethods {

@Then( "user see dashboard menu is displayed")	
	public void user_see_dashboared_menu_is_displayed(DataTable dashboardMenu) {
	jsClick(login.loginBtn);
	List<String> expectedMenu=dashboardMenu.asList();
	
	List<String> actualMenu=new ArrayList<>();
	
  for(WebElement el:dashboard.dashMenu) {
	
	actualMenu.add(el.getText());
	//wait(2);
}
System.out.println(expectedMenu);	
	System.out.println(actualMenu);
	
	Assert.assertTrue(actualMenu.equals(expectedMenu));
	
}
	
}

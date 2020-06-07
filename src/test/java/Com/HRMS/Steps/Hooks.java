package Com.HRMS.Steps;

import Com.HRMS.testbase.BaseClass;
import io.cucumber.java.Before;

public class Hooks  {

@Before
	
	public void start() {
	BaseClass.setUp();
}
	
public void end() {
	BaseClass.tearDown();
}

}

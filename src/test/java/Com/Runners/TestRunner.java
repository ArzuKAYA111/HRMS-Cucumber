package Com.Runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/",//specify which feature file to run
				                               //in our case we do say to run all features inside features package
	
		glue="Com/HRMS/Steps",//where we can find implementation code for gherkin steps?
		                       //we specify just package
		dryRun=false , //if set to true it will quickly scan that all gherkin steps have implementation code
				// if set to true no actual execution will happen       //false run actual file (implement yapilmislari cek ediyor)
		                                                                //true scan all feature (hepsini cek ediyor implement yapilmamisi gerekenleri rapor ediyor code structor cikariyor)
	monochrome=true,
		strict=true ,    //we can use or not use  depends on us
		tags="@addEmployee "
		)



public class TestRunner {

}

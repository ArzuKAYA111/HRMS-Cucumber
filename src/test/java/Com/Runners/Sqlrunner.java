package Com.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// We can learn what all things below do by opening their decleration ...> click
		// on them and right click then open decleration
		features ="src/test/resources/Features/", // specify which feature file to run
													// in our case we do say to run all features inside features package

		glue = "Com/HRMS/Steps", // where we can find implementation code for gherkin steps?
									// we specify just package
		dryRun = false, // if set to true it will quickly scan that all gherkin steps have implementation code
		
						// if set to true no actual execution will happen it gaves only un implement steps in console 
		                //if set false  false run actual file all implementaion 
						
		                // (implement yapilmislari cek ediyor)
						// true scan all feature (hepsini cek ediyor implement yapilmamisi gerekenleri
						// rapor ediyor code structor cikariyor)
		monochrome = true, // it makes the console more understandable ( try run with out monochrome nad
							// with monochrome to understand it)
		 strict=true , //if we have unimplemented step, strict do not allow it to run
		// //we can use or not use depends on us
//		tags ="@firstname",
		tags ="@lastName",

                          // we can write different way tags to execute our feature file/ scenarios etc.
                          // for example "@smoke or @regression we can write like that what means execute
                           // test if has smoke or regression
                            // "@smoke and @regressio

		
		plugin= {
				"pretty",// prints gherkin steps in console
				"html:target/cucumber-default-report",// create basic html report on specified location
		         "json:target/cucumber.json",
		         "rerun:target/failed.txt"   //   to re run only failed  test scenarios 
		
		
		}
		
		
		)

public class Sqlrunner {

}

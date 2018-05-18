package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"features/featureTest/StarWarsFan.feature"},
		glue= {"stepDefination"}
		
		)


public class TestRunner {


}

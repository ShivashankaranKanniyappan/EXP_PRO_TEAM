package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = "src/test/resources/feature10_NewInsuranceNegativeScenarios.feature", 
				glue = { "stepDefinition", "hooks" }, 
				plugin = { "pretty", "json:target\\cucumber.json", 
							"html:target\\htmlreport.html" }, 
				tags = "@All_Scenarios", 
				dryRun = true		
				)
public class RunnerClass extends AbstractTestNGCucumberTests {

	
	
}

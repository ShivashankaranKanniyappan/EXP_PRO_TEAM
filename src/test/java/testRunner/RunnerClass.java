package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources", 
				glue = { "stepDefinition", "hooks" }, 
				plugin = { "pretty", "json:target\\cucumber.json", 
							"html:target\\htmlreport.html" }, 
				tags = "@All_Scenario", 
				dryRun = false		
				)
public class RunnerClass {

}

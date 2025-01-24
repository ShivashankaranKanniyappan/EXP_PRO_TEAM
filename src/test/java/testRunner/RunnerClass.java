package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = "src/test/resources", 
				glue = { "stepDefinition", "hooks" }, 
				plugin = { "pretty", "json:target\\cucumber.json", 
							"html:target\\htmlreport.html" },
				//Snippet = SnippetType.UNDERSCORE,
				tags = "@All_Scenarios", 
				dryRun = false		
				)
public class RunnerClass extends AbstractTestNGCucumberTests {

	
}

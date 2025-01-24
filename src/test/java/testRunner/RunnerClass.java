package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = "src/test/resources", 
				glue = {"stepDefinition", "hooks"}, 
				plugin = { "pretty", "json:target/cucumber.json", 
									"html:target/htmlreport.html" },
				snippets = SnippetType.UNDERSCORE,
				tags = "@Sauce_Demo", 
				dryRun = false		
				)
public class RunnerClass extends AbstractTestNGCucumberTests {

	
	
}

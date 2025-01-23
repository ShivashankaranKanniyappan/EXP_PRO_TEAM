package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = "src/test/resources/feature12_LoginDemoBlaze.feature", 
				glue = { "stepDefinition", "hooks" }, 
				plugin = { "pretty", "json:target\\cucumber.json", 
							"html:target\\htmlreport.html" },
				snippets = SnippetType.UNDERSCORE,
				//tags = "@DemoBlaze", 
				dryRun = false		
				)
public class RunnerClass extends AbstractTestNGCucumberTests {

	
}

package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = "src/test/resources/feature16_Aarthi_loginPage_SauceDemo.feature", 
				glue = {"stepDefinition", "hooks"}, 
				plugin = { "pretty", "json:target/cucumber.json", 
									"html:target/htmlreport.html" },
				snippets = SnippetType.UNDERSCORE,
				tags = "@Sauce_Demo", 
				dryRun = true
				)
public class RunnerClass extends AbstractTestNGCucumberTests {

	
	
}

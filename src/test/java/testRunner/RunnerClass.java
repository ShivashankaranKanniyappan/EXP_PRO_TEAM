package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = {"src/test/resources"},
				glue = {"stepDefinition", "hooks"}, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "json:target\\cucumber.json", 
									"html:target\\htmlreport.html"},
Suthirshana
				dryRun = true,
				 tags = "@TableHeader"
				dryRun = true
				// tags = "@login"
				)
public class RunnerClass extends AbstractTestNGCucumberTests 
{
		
}

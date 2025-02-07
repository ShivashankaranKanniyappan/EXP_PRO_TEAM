package testRunner;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
 
@CucumberOptions(
		
				features = 
			{"src/test/resources/SauceDemo/Feature07_Suthir_MultipleAlltheProducts.feature"},
//				{"src/test/resources/ExpleoSurance", 
//							"src/test/resources/DemoBlaze", 
//							"src/test/resources/SauceDemo",
//							"src/test/resources/AdactinHotel",
//							"src/test/resources/SportsJam"},
//				
				glue = {"stepDefinition", "hooks"}, 
				plugin = { "pretty", "json:target/cucumber.json", 
									"html:target/htmlreport.html" },
				snippets = SnippetType.UNDERSCORE,
				tags = "@All_Scenarios", 
				dryRun = true
				
				)
public class RunnerClass extends AbstractTestNGCucumberTests {
 
	
}
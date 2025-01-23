package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import driverInstance.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends drivers {

	@Before
	public void browserLaunch(Scenario scenario) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "http://192.168.99.141:3000/";



		if (scenario.getSourceTagNames().contains("@deleteUser")) {
			url = "http://192.168.99.141:3000/home";
		} else if (scenario.getSourceTagNames().contains("@DemoBlaze")) {
			url = "https://www.demoblaze.com/index.html";
		}


		driver.get(url);
	}

	@After
	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}

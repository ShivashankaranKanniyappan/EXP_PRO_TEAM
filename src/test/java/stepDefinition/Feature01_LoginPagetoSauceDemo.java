package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import driverInstance.drivers;
import io.cucumber.java.en.*;

public class Feature01_LoginPagetoSauceDemo extends drivers {
	
	@Given("User should be in Sauce Demo login page")
	public void user_should_be_in_sauce_demo_login_page() {
		System.out.println("User enter login Page Successfully"); 
	}
	@When("User enters valid Username and Password for sauce demo")
	public void user_enters_valid_username_and_password_for_sauce_demo() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Then("User should be logged in sauce Demo page successfully")
	public void user_should_be_logged_in_sauce_demo_page_successfully() {
		System.out.println("Logged in successfully");
	}
}

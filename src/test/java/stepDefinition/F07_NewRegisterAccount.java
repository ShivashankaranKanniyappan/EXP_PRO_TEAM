package stepDefinition;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class F07_NewRegisterAccount extends drivers{
	
	@Given("useris on the login page with valid credential")
	public void useris_on_the_login_page_with_valid_credential() {
		System.out.print("logion Sucessfully");
	    
	}

	@When("user clicks the register new account")
	public void user_clicks_the_register_new_account() {
		driver.findElement(By.xpath("//h4[normalize-space()='Register new account']")).click();
		}

	@When("user enters the {string} and {string} and {string}")
	public void user_enters_the_and_and(String email, String password, String checkpassword) {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(checkpassword);
	    
	}

	@When("user clicks Register button")
	public void user_clicks_register_button() {
		driver.findElement(By.xpath("//button[text()='Register']")).click();	    
	}

	@When("user click Navigate to login page")
	public void user_click_navigate_to_login_page() throws InterruptedException {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement navigate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Navigate to login Page']")));
		Thread.sleep(2000);
	}
	
	@When("user enters Email and Password")
	public void user_enters_email_and_password() {
		driver.get("http://192.168.99.141:3000/");
		driver.findElement(By.id("username")).sendKeys("aarthi17@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Aarth@i23");
	}

	@Then("user navigate to the dashboard page")
	public void user_navigate_to_the_dashboard_page() {
	   driver.findElement(By.xpath("//button[text()='Submit']")).click();	}


}

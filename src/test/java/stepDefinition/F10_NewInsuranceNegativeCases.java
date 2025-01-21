package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class F10_NewInsuranceNegativeCases extends drivers {
	
	@Given("User should be in login page")
	public void user_should_be_in_login_page() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("Login Successful");
	}
	@When("User enters the {string}, {string},{string},{string}")
	public void user_enters_the(String Name, String Email, String Address, String BirthDate) throws InterruptedException {
		driver.findElement(By.id("Name")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("Address")).sendKeys(Address);
		driver.findElement(By.id("DateOfBirth")).sendKeys(BirthDate);
	}
	@When("User select the {string} as Male\\/Female")
	public void user_select_the_as_male_female(String value) throws InterruptedException {	
		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']")); 
		gender.click();
	}
	@When("User select the PolicyType, Coverage, SumInsured,{string}")
	public void user_select_the_policy_type_coverage_sum_insured(String Premium) throws InterruptedException {

		WebElement policyType = driver.findElement(By.xpath("//select[@name='policyType']"));
		Select selectPolicyType = new Select(policyType);
		selectPolicyType.selectByIndex(2);
		
		WebElement coverage = driver.findElement(By.name("coverage"));
		Select selectCoverage = new Select(coverage);
		selectCoverage.selectByVisibleText("Endowment");
		
		WebElement SumIssured = driver.findElement(By.name("SumInsured"));
		Select selectSumIssured = new Select(SumIssured);
		selectSumIssured.selectByValue("500000");
		
		driver.findElement(By.id("Premium")).sendKeys(Premium);
	}
	@When("User press the sumbit button and it will show the error message")
	public void user_press_the_sumbit_button_and_it_will_show_the_error_message() throws InterruptedException {
		Thread.sleep(2000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']"))).click();

	}
	@Then("It should be logged out")
	public void it_should_be_logged_out() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Locate all error message elements
	    List<WebElement> errorMessages = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(@class, 'error')]")));

	    // Print all error messages
	    if (!errorMessages.isEmpty()) {
	        System.out.println("Captured Error Messages:");
	        for (WebElement errorMessage : errorMessages) {
	            System.out.println("- " + errorMessage.getText());
	        }
	    } else {
	        System.out.println("No error messages displayed.");
	    }    
	}
}

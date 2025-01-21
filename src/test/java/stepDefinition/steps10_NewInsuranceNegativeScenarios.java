package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class steps10_NewInsuranceNegativeScenarios extends drivers {

	@Given("User should be in login page")
	public void user_should_be_in_login_page() {
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("shivashankaran.kanniyappan@expleogroup.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Shiva@1919");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("Login Successful");
	}

	@When("User Clicks the NewInsurance Tab")
	public void user_clicks_the_new_insurance_tab() {
		WebElement newInsurance = driver.findElement(By.xpath("//a[normalize-space()='New Insurance']"));
		newInsurance.click();
	}

	@When("User enters all the Fields Without {string}, {string}, {string}, {string}")
	public void user_enters_all_the_fields_without(String Name, String Email, String Address, String BirthDate) {
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='Address']")).sendKeys(Address);
		driver.findElement(By.id("DateOfBirth")).sendKeys(BirthDate);
	}

	@When("User Click the Gender male or female")
	public void user_click_the_gender_male_or_female() throws InterruptedException {
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		Thread.sleep(2000);
	}

	@When("User Select the {string}, {string}, {string} and {string}")
	public void user_select_the_and(String PolicyType, String Coverage, String SumInsured, String Premium) throws InterruptedException {
		WebElement policyType = driver.findElement(By.name("policyType"));
		Select selectpolicyType = new Select(policyType);
		selectpolicyType.selectByIndex(2);
		Thread.sleep(1000);
		WebElement coverage = driver.findElement(By.name("coverage"));
		Select selectCoverage = new Select(coverage);
		selectCoverage.selectByValue("Term");
		Thread.sleep(2000);
		WebElement sumInsured = driver.findElement(By.name("SumInsured"));
		Select selectSumInsured = new Select(sumInsured);
		selectSumInsured.selectByVisibleText("1,00,000");
		Thread.sleep(2000);
		driver.findElement(By.id("Premium")).sendKeys("10");
	}

	@Then("User click the Submit button and it should show Error")
	public void user_click_the_submit_button_and_it_should_show_error() {


	}

}

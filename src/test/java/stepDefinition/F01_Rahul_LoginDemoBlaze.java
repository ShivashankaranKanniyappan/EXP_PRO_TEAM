package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F01_Rahul_LoginDemoBlaze extends drivers  {
	
	@Given("user navigate to the login page")
	public void navigateToLoginPage() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.id("login2"));
		Thread.sleep(2000);
		loginButton.click();
	}

	@When("user enter valid login credentials")
	public void enterValidCredentials() throws InterruptedException {
		WebElement usernameField = driver.findElement(By.id("loginusername"));
		usernameField.sendKeys("testuserragul");

		WebElement passwordField = driver.findElement(By.id("loginpassword"));
		passwordField.sendKeys("password123");
		Thread.sleep(2000);

		WebElement loginSubmitButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginSubmitButton.click();
	}


	@Then("user should be redirected to the homepage")
	public void user_should_be_redirected_to_the_homepage() throws InterruptedException {
		Thread.sleep(2000);
		WebElement homePage = driver.findElement(By.id("nameofuser"));
		String text = homePage.getText();
		System.out.println(text);
	}
}

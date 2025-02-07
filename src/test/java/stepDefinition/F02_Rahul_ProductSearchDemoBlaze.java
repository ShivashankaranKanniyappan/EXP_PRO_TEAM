package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F02_Rahul_ProductSearchDemoBlaze extends drivers {

	//WebDriver driver;

	@Given("user is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.id("login2"));
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		WebElement usernameField = driver.findElement(By.id("loginusername"));
		usernameField.sendKeys("testuserragul");

		WebElement passwordField = driver.findElement(By.id("loginpassword"));
		passwordField.sendKeys("password123");
		Thread.sleep(2000);	

		WebElement loginSubmitButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginSubmitButton.click();	
		Thread.sleep(7000);
	}

	@When("user search for {string}")
	public void user_search_for(String string) throws InterruptedException {
		WebElement product = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		product.click();
		Thread.sleep(7000);
		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		addToCartButton.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(2000);
	}

	@Then("user should see the product in the cart")
	public void userShouldSeeTheProductInTheCart() {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
		cartButton.click();

		//WebElement cartProduct = driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']"));
		//assert cartProduct.isDisplayed();
	}
}

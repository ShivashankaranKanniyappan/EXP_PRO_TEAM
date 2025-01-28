package stepDefinition;


import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;

import org.openqa.selenium.By;

import static org.junit.Assert.*;

import java.time.Duration;

public class F22_DemoBlazeE2E  extends drivers {



	@Given("User should be on the Demoblaze homepage")

	public void userShouldBeOnHomepage() throws InterruptedException {

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

	@When("user clicks on the {string} category")

	public void userClicksOnCategory(String category) {

		driver.findElement(By.linkText(category)).click();

	}

	@When("user selects the {string} product")

	public void userSelectsTheProduct(String product) throws InterruptedException {
		Thread.sleep(16000);

		driver.findElement(By.linkText(product)).click();
		Thread.sleep(16000);
	}

	@When("user clicks the {string} button")

	public void user_clicks_the_button(String string) throws InterruptedException {

		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		addToCartButton.click();
	}



	@And("A confirmation popup appears with the message {string}")

	public void confirmationPopupAppears(String message) throws InterruptedException {
		Thread.sleep(7000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));


	}

	@When("user clicks the {string} button on the popup")
	public void user_clicks_the_button_on_the_popup(String string) {
		wait.until(ExpectedConditions.alertIsPresent()).accept();


	}

	@Then("The cart should contain the {string}")

	public void theCartContainsProduct(String product) throws InterruptedException {

		driver.findElement(By.id("cartur")).click();

		Thread.sleep(16000);
		boolean productInCart = driver.getPageSource().contains(product);

		assertTrue("Product is not in the cart", productInCart);

	}

}





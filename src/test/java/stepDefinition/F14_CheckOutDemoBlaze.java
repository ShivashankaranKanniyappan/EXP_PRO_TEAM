package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F14_CheckOutDemoBlaze extends drivers {


	@When("user have a product in my cart")
	public void userHaveAProductInMyCart() throws InterruptedException {
		WebElement product = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
		product.click();
		Thread.sleep(2000);
		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		addToCartButton.click();
		//driver.switchTo().alert().accept();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
		cartButton.click();

		//Thread.sleep(7000);
		//WebElement cartProduct = driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']"));
		//assert cartProduct.isDisplayed();

		Thread.sleep(2000);
		WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		Actions act = new Actions(driver);
		act.click(checkoutButton).build().perform();
		Thread.sleep(2000);

		WebElement nameField = driver.findElement(By.id("name"));
		WebElement countryField = driver.findElement(By.id("country"));
		WebElement cityField = driver.findElement(By.id("city"));
		WebElement cardField = driver.findElement(By.id("card"));
		WebElement monthField = driver.findElement(By.id("month"));
		WebElement yearField = driver.findElement(By.id("year"));

		nameField.sendKeys("Ragul");
		countryField.sendKeys("India");
		cityField.sendKeys("Chennai");
		cardField.sendKeys("1234567812345678");
		monthField.sendKeys("12");
		yearField.sendKeys("2025");
	}

	// @When("user proceed to checkout and provide payment details")
	//public void userProceedToCheckoutAndProvidePaymentDetails() throws InterruptedException {
	//Thread.sleep(7000);


	@Then("user should receive an order confirmation")
	public void userShouldReceiveAnOrderConfirmation() {


		WebElement purchaseButton = driver.findElement(By.xpath("//button[text()='Purchase']"));
		purchaseButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement orderConfirmation = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Thank you for your purchase!']")));
		assert orderConfirmation.isDisplayed();
	}
}

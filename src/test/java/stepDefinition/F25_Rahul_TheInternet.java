package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverInstance.drivers;

import org.openqa.selenium.Alert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import java.util.Set;

public class F25_Rahul_TheInternet extends drivers{


	@Given("I am on the login page")
	public void iAmOnTheLoginPage() throws InterruptedException {
		Thread.sleep(3000);
	}

	@When("I enter valid credentials")
	public void iEnterValidCredentials() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	@Then("I should be logged in and redirected to the secure area")
	public void iShouldBeLoggedInAndRedirectedToTheSecureArea() throws InterruptedException {
		Thread.sleep(3000);
		WebElement secureAreaHeader = driver.findElement(By.xpath("//h4[text()='Welcome to the Secure Area. When you are done click logout below.']"));
		assertTrue(secureAreaHeader.isDisplayed());
	}

	@When("I log out")
	public void iLogOut() {
		WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/logout']"));
		logoutButton.click();
	}

	@Then("I should be redirected to the login page")
	public void iShouldBeRedirectedToTheLoginPage() {
		WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login Page']"));
		assertTrue(loginHeader.isDisplayed());
	}


	@Given("I am on the JavaScript Alerts page")
	public void iAmOnTheJavaScriptAlertsPage() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@When("I click the Click for JS Alert button")
	public void iClickTheClickForJSAlertButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		button.click();
	}

	@Then("I should see an alert box with the text")
	public void iShouldSeeAnAlertBoxWithTheText() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		assertEquals("I am a JS Alert", alertMessage);
	}

	@When("I accept the alert")
	public void iAcceptTheAlert() throws InterruptedException {
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("I should see the result message")
	public void iShouldSeeTheResultMessage() {
		WebElement result = driver.findElement(By.id("result"));
		assertEquals("You successfully clicked an alert", result.getText());
	}


	@Given("I am on the dropdown page")
	public void iAmOnTheDropdownPage() {
		driver.get("https://the-internet.herokuapp.com/dropdown");
	}

	@When("I select Option 2 from the dropdown")
	public void iSelectOption2FromTheDropdown() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		dropdown.click();
		WebElement optionToSelect = driver.findElement(By.xpath("//option[text()='Option 2']"));
		optionToSelect.click();
	}

	@Then("I should see Option 2 as the selected option")
	public void iShouldSeeOption2AsTheSelectedOption() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		String selectedOption = dropdown.findElement(By.cssSelector("option:checked")).getText();
		assertEquals("Option 2", selectedOption);
	}

	@When("I select Option 1 from the dropdown")
	public void iSelectOption1FromTheDropdown() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		dropdown.click();
		WebElement optionToSelect = driver.findElement(By.xpath("//option[text()='Option 1']"));
		optionToSelect.click();
	}

	@Then("I should see Option 1 as the selected option")
	public void iShouldSeeOption1AsTheSelectedOption() {
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		String selectedOption = dropdown.findElement(By.cssSelector("option:checked")).getText();
		assertEquals("Option 1", selectedOption);
	}


	@Given("I am on the Checkboxes page")
	public void iAmOnTheCheckboxesPage() {
		driver.get("https://the-internet.herokuapp.com/checkboxes");
	}

	@When("I check the first checkbox")
	public void iCheckTheFirstCheckbox() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	@Then("the first checkbox should be checked")
	public void theFirstCheckboxShouldBeChecked() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		assertTrue(checkbox.isSelected());
	}

	@When("I uncheck the first checkbox")
	public void iUncheckTheFirstCheckbox() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	@Then("the first checkbox should be unchecked")
	public void theFirstCheckboxShouldBeUnchecked() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		assertFalse(checkbox.isSelected());
	}
	@Given("I am on the File Upload page")
	public void iAmOnTheFileUploadPage() {
		driver.get("https://the-internet.herokuapp.com/upload");
	}

	@When("I upload a file")
	public void iUploadAFile() throws InterruptedException {
		WebElement uploadElement = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		String filePath = "C:\\Blank\\blank.pdf"; 
		uploadElement.sendKeys(filePath);
		Thread.sleep(3000);
		WebElement submitButton = driver.findElement(By.id("file-submit"));
		submitButton.click();
		Thread.sleep(3000);
	}

	@Then("I should see the file name displayed on the page")
	public void iShouldSeeTheFileNameDisplayedOnThePage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement uploadedFileName = driver.findElement(By.id("uploaded-files"));
		assertTrue(uploadedFileName.getText().contains("blank"));
	}

	@Then("I should see the success message indicating the file was uploaded")
	public void iShouldSeeTheSuccessMessageIndicatingTheFileWasUploaded() throws InterruptedException {
		Thread.sleep(3000);
		WebElement uploadedFileMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
		assertTrue(uploadedFileMessage.isDisplayed());
	}
	@Given("I am on the Windows page")
	public void iAmOnTheWindowsPage() {
		driver.get("https://the-internet.herokuapp.com/windows");
	}

	@When("I open a new window by clicking the link")
	public void iOpenANewWindowByClickingTheLink() {
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();
	}

	@Then("I should be switched to the new window")
	public void iShouldBeSwitchedToTheNewWindow() {
		
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			driver.switchTo().window(windowHandle);
		}
	}

	@Then("I should see the new window's content")
	public void iShouldSeeTheNewWindowsContent() {
		WebElement newWindowContent = driver.findElement(By.tagName("h3"));
		assertTrue(newWindowContent.getText().contains("New Window"));
	}}
	
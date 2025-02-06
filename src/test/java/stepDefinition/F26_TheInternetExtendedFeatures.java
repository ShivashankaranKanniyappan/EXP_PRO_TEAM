package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class F26_TheInternetExtendedFeatures  extends drivers {

	private String initialContent; 


	@Given("I am on the JavaScript Prompt page")
	public void iAmOnTheJavaScriptPromptPage() {
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	}

	@When("I click the Click for JS Prompt button")
	public void iClickTheClickForJSPromptButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement jsPromptButton = driver.findElement(By.xpath("//button[contains(text(), 'Click for JS Prompt')]"));
		jsPromptButton.click();
	}

	@Then("I should see a prompt box with the text I am a JS prompt")
	public void iShouldSeeAPromptBoxWithTheText() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("I am a JS prompt", alertText);
	}

	@When("I enter Hello World in the prompt box")
	public void iEnterHelloWorldInThePromptBox() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello World");
	}

	@When("I click OK")
	public void iClickOK() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("I should see the result message containing Hello World")
	public void iShouldSeeTheResultMessageContainingHelloWorld() {
		WebElement resultMessage = driver.findElement(By.id("result"));
		assertTrue(resultMessage.getText().contains("Hello World"));
	}


	@Given("I am on the Drag and Drop page")
	public void iAmOnTheDragAndDropPage() {
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
	}

	@When("I drag the element A and drop it onto B")
	public void iDragTheElementAAndDropItOntoB() {
		WebElement elementA = driver.findElement(By.id("column-a"));
		WebElement elementB = driver.findElement(By.id("column-b"));
		new Actions(driver).dragAndDrop(elementA, elementB).perform();
	}

	@Then("A should be dropped onto B")
	public void aShouldBeDroppedOntoB() {
		WebElement elementA = driver.findElement(By.id("column-a"));
		WebElement elementB = driver.findElement(By.id("column-b"));
		assertNotEquals(elementA.getText(), "A");
		assertEquals(elementB.getText(), "A");
	}

	@Then("the positions of A and B should be swapped")
	public void thePositionsOfAAndBShouldBeSwapped() {
		WebElement elementA = driver.findElement(By.id("column-a"));
		WebElement elementB = driver.findElement(By.id("column-b"));
		assertEquals(elementA.getText(), "B");
		assertEquals(elementB.getText(), "A");
	}


	@Given("I am on the homepage")
	public void iAmOnTheHomepage() {
		driver.get("http://the-internet.herokuapp.com/");
	}

	@When("I click on the Form Authentication link")
	public void iClickOnTheFormAuthenticationLink() throws InterruptedException {
		WebElement formAuthenticationLink = driver.findElement(By.linkText("Form Authentication"));
		formAuthenticationLink.click();
		Thread.sleep(9000);
	}

	@Then("I should be redirected to the Form Authentication page")
	public void iShouldBeRedirectedToTheFormAuthenticationPage() {
		assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
	}

	@When("I navigate back to the homepage")
	public void iNavigateBackToTheHomepage() {
		driver.navigate().back();
	}

	@Then("I should be back on the homepage")
	public void iShouldBeBackOnTheHomepage() {
		assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/");
	}


	@Given("I am on the homepa")
	public void iAmOnTheHomepa() {
		driver.get("http://the-internet.herokuapp.com/");
	}

	@When("I check the title of the page")
	public void iCheckTheTitleOfThePage() {
		String title = driver.getTitle();
		assertEquals(title, "The Internet");
	}

	@Then("the title should be The Internet")
	public void theTitleShouldBeTheInternet() {
		String title = driver.getTitle();
		assertEquals(title, "The Internet");
	}


	@Given("I am on the Windows pag")
	public void iAmOnTheWindowsPag() {
		driver.get("http://the-internet.herokuapp.com/windows");
		WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
		clickHereLink.click();
	}


	@Then("I should be switched to the new windo")
	public void iShouldBeSwitchedToTheNewWindo() {
		String currentWindowHandle = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}

	@Then("I should see the new window's contents")
	public void iShouldSeeTheNewWindowsContents() {
		WebElement newWindowContent = driver.findElement(By.tagName("h3"));
		assertEquals(newWindowContent.getText(), "New Window");
	}

	@Given("I am on the Checkboxes pag")
	public void iAmOnTheCheckboxesPag() {
		driver.get("http://the-internet.herokuapp.com/checkboxes");
	}

	@When("I verify the status of Checkbox 1")
	public void iVerifyTheStatusOfCheckbox1() {
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		assertFalse(checkbox1.isSelected());
	}

	@Then("Checkbox 1 should be unchecked")
	public void checkbox1ShouldBeUnchecked() {
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		assertFalse(checkbox1.isSelected());
	}

	@When("I verify the status of Checkbox 2")
	public void iVerifyTheStatusOfCheckbox2() throws InterruptedException {
		Thread.sleep(9000);
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		assertTrue(checkbox2.isSelected());
	}

	@Then("Checkbox 2 should be unchecked")
	public void checkbox2ShouldBeUnchecked() {
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		assertTrue(checkbox2.isSelected());
	}

	@Given("I am on the homepag")
	public void iAmOnTheHomepag() {
		driver.get("http://the-internet.herokuapp.com/");
	}

	@When("I check for the presence of text Welcome to the Internet")
	public void iCheckForThePresenceOfText() {
		WebElement body = driver.findElement(By.tagName("body"));
		assertTrue(body.getText().contains("Welcome to the-internet"));
		
	}
	
	 @Given("I navigate to the \"Dynamic Content\" page")
	    public void iNavigateToDynamicContentPage() {
	      
	        driver.get("http://the-internet.herokuapp.com/dynamic_content");
	      
	        initialContent = driver.findElement(By.id("content")).getText();
	    }

	    @When("I reload the page")
	    public void iReloadThePage() {
	       
	        driver.navigate().refresh();
	    }

	    @Then("the dynamic content should change from the previous content")
	    public void theDynamicContentShouldChangeFromPreviousContent() {
	        
	        String newContent = driver.findElement(By.id("content")).getText();
	    
	       assertNotEquals("Content did not change after reload!", initialContent, newContent);
	       
	        driver.quit();
	    }
	}




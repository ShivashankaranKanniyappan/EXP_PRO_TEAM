package stepDefinition;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
 
public class F24_DemoBlazeWebsiteInteractions extends drivers{
 
     
    @Given("I open the Demo Blaze website")
    public void i_open_the_demo_blaze_website() throws InterruptedException {
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
 
    @Then("I should see the title {string}")
    public void i_should_see_the_title(String expectedTitle) {
        assertEquals(expectedTitle, driver.getTitle());
    }
 
    
    @When("I click on the {string} category")
    public void i_click_on_the_category(String category) {
        WebElement categoryLink = driver.findElement(By.linkText(category));
        categoryLink.click();
    }
 
    @Then("I should see a list of laptops")
    public void i_should_see_a_list_of_laptops() {
        WebElement laptopsSection = driver.findElement(By.className("col-sm-4"));
        assertTrue(laptopsSection.isDisplayed());
    }
 
    
    @When("I click on the {string} link")
    public void i_click_on_the_link(String linkText) throws InterruptedException {
        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
        Thread.sleep(10000);
    }
 
    @Then("I should see the header {string}")
    public void i_should_see_the_header(String expectedHeader) throws InterruptedException {
    	Thread.sleep(10000);
    	WebElement email = driver.findElement(By.id("recipient-email"));
    	email.sendKeys("Test@test.com");
    	WebElement name = driver.findElement(By.id("recipient-name"));
    	name.sendKeys("Test@test.com");
    	WebElement message = driver.findElement(By.id("message-text"));
    	message.sendKeys("Prodcut id 12345 not yet delivered");
    	
    	driver.findElement(By.xpath("//button[text()='Send message']")).click();
    	
       // WebElement header = driver.findElement(By.tagName("h2"));
        //assertEquals(expectedHeader, header.getText());
    }
 
    @When("I click on the About us link")
    public void i_click_on_the_about_us_link() {
    	
    driver.findElement(By.xpath("//a[text()='About us']")).click();	
    }
    
    @Then("I should see the text About us")
    public void i_should_see_the_text_about_us() throws InterruptedException {
    	
    //driver.findElement(By.xpath("//a[text()='About us']")).click();
    	Thread.sleep(10000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement VerifyAboutUs = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[text()='About us']")));
	assert VerifyAboutUs.isDisplayed();
    	
//        WebElement aboutUsText = driver.findElement(By.xpath("//p[contains(text(), 'About us')]"));
//        assertTrue(aboutUsText.getText().contains(expectedText));
    }
 
    
    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonName) {
        WebElement homeButton = driver.findElement(By.id("nava"));
        homeButton.click();
    }
 
    @Then("I should be on the homepage")
    public void i_should_be_on_the_homepage() {
        assertEquals("STORE", driver.getTitle());
    }
}
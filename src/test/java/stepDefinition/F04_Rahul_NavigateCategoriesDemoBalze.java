package stepDefinition;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class F04_Rahul_NavigateCategoriesDemoBalze extends drivers {
	



	@Given("the user is on the homepage")
    public void userIsOnHomepage() throws InterruptedException {
        
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

    @When("the user clicks on the {string} category")
    public void userClicksOnCategory(String Laptops) throws InterruptedException {
        
        WebElement categoryLink = driver.findElement(By.xpath("//a[text()='Laptops']"));
        categoryLink.click();
        Thread.sleep(7000);  
    }

    @Then("the user should see a list of products in the {string} category")
    public void userSeesListOfProductsInCategory(String Laptops) {
        
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Laptops')]")));
         //assertTrue(pageTitle.isDisplayed());

      
        WebElement productList = driver.findElement(By.className("card-title"));
        assertTrue(productList.isDisplayed());
    }
}

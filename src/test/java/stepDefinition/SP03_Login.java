package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SP03_Login extends drivers{
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		

		driver.findElement(By.xpath("//a[@class='button js-item-myaccount-action']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		
	Thread.sleep(3000);
		
		System.out.print("Login Successfully");
	   
	}
	@Given("user gives valid {string} and {string}>")
	public void user_gives_valid_and(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("login[username]")).sendKeys(username);
		Thread.sleep(4000);
		driver.findElement(By.name("login[password]")).sendKeys(password);
		Thread.sleep(4000);
	}
	@Then("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		
		
		WebElement login = driver.findElement(By.xpath("(//span[text()='Sign In'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", login);
		System.out.println("Login Successful");
		Thread.sleep(5000);

		
	}

}

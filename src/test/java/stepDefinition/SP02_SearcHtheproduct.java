package stepDefinition;

import org.openqa.selenium.By;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SP02_SearcHtheproduct extends drivers{
	
	@Given("user ison the login page")
	public void user_ison_the_login_page() {
		driver.get("https://sportsjam.in/");
	    
	}



	
	@Given("user click search button")
	public void user_click_search_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@class='button action-search-slideout']//span[1]")).click();
		Thread.sleep(4000);
		
	}

	@Given("user click the searc button again")
	public void user_click_the_searc_button_again() throws InterruptedException {
		
	driver.findElement(By.xpath("//input[@class='input-text js-input-focus']")).click();
	Thread.sleep(4000);
	    
	}

	@Given("user search the products")
	public void user_search_the_products() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='input-text js-input-focus']")).sendKeys("shoes");
		Thread.sleep(4000);
	}

	@Then("user clicks go button")
	public void user_clicks_go_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class='action search']")).click();
		Thread.sleep(4000);
	    
	}



	

}

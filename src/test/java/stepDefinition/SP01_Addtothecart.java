package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SP01_Addtothecart extends drivers{
	
	@Given("user cliks the image")
	public void user_cliks_the_image() throws InterruptedException {
		WebElement image = driver.findElement(By.xpath("(//div[contains(@class,'product actions')]/following-sibling::a)[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", image);
		
		Thread.sleep(5000);
	}

	@Given("user add the image to cart")
	public void user_add_the_image_to_cart() throws InterruptedException {
		
		WebElement add = driver.findElement(By.xpath("(//button[contains(@class,'action primary')]//span)[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add);
		
		Thread.sleep(5000);
	    
	}

	@Then("user view and remove the product")
	public void user_view_and_remove_the_product() throws InterruptedException {

		
		driver.findElement(By.xpath("//a[@class='action viewcart']//span[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='action action-delete'])[1]")).click();
		Thread.sleep(5000);
	   
	}




}

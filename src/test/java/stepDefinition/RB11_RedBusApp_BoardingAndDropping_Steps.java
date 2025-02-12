package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class RB11_RedBusApp_BoardingAndDropping_Steps extends drivers{
	@Then("User click on the Boarding and Dropping Points")
	public void user_click_on_the_boarding_and_dropping_points() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Boarding & Dropping Points'])[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//h4[text()='BOARDING POINT']")).getText();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//h4[text()='DROPPING POINT']")).getText();
	   
	}	

}

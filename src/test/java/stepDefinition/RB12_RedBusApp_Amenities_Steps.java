package stepDefinition;

import org.openqa.selenium.By;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class RB12_RedBusApp_Amenities_Steps extends drivers{

	@Then("User click on the Amenities")
	public void user_click_on_the_amenities() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Amenities']")).click();
	}

}

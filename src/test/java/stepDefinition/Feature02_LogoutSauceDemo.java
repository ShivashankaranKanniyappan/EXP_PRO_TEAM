package stepDefinition;

import org.openqa.selenium.By;
import driverInstance.drivers;
import io.cucumber.java.en.Then;

public class Feature02_LogoutSauceDemo extends drivers {
	@Then("User clicks the Open Menu")
	public void user_clicks_the_open_menu() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
	
		Thread.sleep(2000);
	}

	@Then("User click the logout")
	public void user_click_the_logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}

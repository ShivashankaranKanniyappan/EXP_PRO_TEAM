package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverInstance.drivers;
import io.cucumber.java.en.*;

public class RB05_RedBusApp_BookingBusTicket_ViewSeat_Steps extends drivers {
	
	@Then("User click on the bus")
	public void user_click_on_the_bus() {
	     WebElement Bus = driver.findElement(By.xpath("//div[text()='N.S.T THANISHA TRAVELS']"));
	     String text = Bus.getText();
	     System.out.println(text);
	}

	@Then("User click on the View Seats")
	public void user_click_on_the_view_seats() {
		 driver.findElement(By.xpath("//div[text()='View Seats']")).click();
	         
	}

}

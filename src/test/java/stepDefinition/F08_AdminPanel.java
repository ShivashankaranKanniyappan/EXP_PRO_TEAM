package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

import java.time.*;

public class F08_AdminPanel extends drivers {
	
	@When("user clicks the Admin panel")
	public void user_clicks_the_admin_panel() throws InterruptedException {
		Thread.sleep(3000);		
		WebElement Admin_panel = driver.findElement(By.xpath("//a[normalize-space()='Admin Panel']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Admin_panel);
		Thread.sleep(3000);
	}

	@When("user clicks manage users")
	public void user_clicks_manage_users() {
		driver.findElement(By.xpath("//button[text()='View Users']")).click();
	}

	@Then("user delete the button")
	public void user_delete_the_button() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 16000)");
		 Thread.sleep(3000);
 
		WebElement delete_btn = driver.findElement(By.xpath("//td[text()='aarthi17@gmail.com']/following::td[2][@class='deleteButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", delete_btn);
		Actions act = new Actions(driver);
		act.click(delete_btn).build().perform();
		Thread.sleep(5000);
		
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		WebElement doubleClickYes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Yes']")));
		Actions act1 = new Actions(driver);
		act1.doubleClick(doubleClickYes).build().perform();
		Thread.sleep(2000);
 
		System.out.println("Users Deleted Successfully");
	
		
		
	   
	}

}

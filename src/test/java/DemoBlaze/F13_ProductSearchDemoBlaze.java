package DemoBlaze;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F13_ProductSearchDemoBlaze extends drivers {

	WebDriver driver;

    @Given("user search for {string}")
    public void userSearchFor(String product) {
        WebElement searchBox = driver.findElement(By.id("search"));
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchBox.sendKeys(product);
        searchButton.click();
    }

    @When("user add the product to the cart")
    public void userAddTheProductToTheCart() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Samsung galaxy s6']")));
        product.click();
        
        WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCartButton.click();
    }

    @Then("user should see the product in the cart")
    public void userShouldSeeTheProductInTheCart() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur")));
        cartButton.click();
        
        WebElement cartProduct = driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']"));
        assert cartProduct.isDisplayed();
    }
}

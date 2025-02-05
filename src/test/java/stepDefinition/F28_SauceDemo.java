package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import java.util.List;

public class F28_SauceDemo extends drivers {

    @Given("I log in as a custom user performance_glitch_user with password secret_sauce")
    public void i_log_in_as_a_custom_user() throws InterruptedException {
    	Thread.sleep(4000);
        
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {
       
    }

    @Then("I should see a list of products displayed with the correct product details")
    public void i_should_see_a_list_of_products_displayed() {
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        assertTrue("No products displayed", products.size() > 0);
        
        for (WebElement product : products) {
            WebElement title = product.findElement(By.className("inventory_item_name"));
            WebElement price = product.findElement(By.className("inventory_item_price"));
            assertNotNull("Product name is missing", title.getText());
            assertNotNull("Product price is missing", price.getText());
        }
    }

    @Given("I am logged into Sauce Labs")
    public void i_am_logged_into_sauce_labs() {
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("I add the first product to the cart")
    public void i_add_the_first_product_to_the_cart() {
        WebElement firstProductAddToCartButton = driver.findElement(By.cssSelector(".btn_inventory"));
        firstProductAddToCartButton.click();
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }

    @Then("I should successfully complete the purchase")
    public void i_should_successfully_complete_the_purchase() {
        WebElement confirmationMessage = driver.findElement(By.className("complete-header"));
        assertEquals("Thank you for your order!", confirmationMessage.getText());
    }

    @When("I sort the products by price from high to low")
    public void i_sort_the_products_by_price_high_to_low() {
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.click();
        WebElement sortOption = driver.findElement(By.xpath("//option[@value='hilo']"));
        sortOption.click();
    }

    @Then("the products should be sorted correctly from high to low")
    public void the_products_should_be_sorted_high_to_low() {
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
        double previousPrice = Double.MAX_VALUE;
        for (WebElement price : prices) {
            double currentPrice = Double.parseDouble(price.getText().substring(1));  // Removing "$" sign
            assertTrue("Products are not sorted correctly", currentPrice <= previousPrice);
            previousPrice = currentPrice;
        }
    }

    @When("I sort the products by price from low to high")
    public void i_sort_the_products_by_price_low_to_high() {
        WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
        sortDropdown.click();
        WebElement sortOption = driver.findElement(By.xpath("//option[@value='lohi']"));
        sortOption.click();
    }

    @Then("the products should be sorted correctly from low to high")
    public void the_products_should_be_sorted_low_to_high() {
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
        double previousPrice = 0.0;
        for (WebElement price : prices) {
            double currentPrice = Double.parseDouble(price.getText().substring(1));  // Removing "$" sign
            assertTrue("Products are not sorted correctly", currentPrice >= previousPrice);
            previousPrice = currentPrice;
        }
    }  
    
    @When("I add the first product to the car")
    public void i_add_the_first_product_to_the_car() {
        WebElement firstProductAddToCartButton = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']"));
        firstProductAddToCartButton.click();
    }

    @When("I add the second product to the cart")
    public void i_add_the_second_product_to_the_cart() {
        WebElement secondProductAddToCartButton = driver.findElement(By.cssSelector("[data-test='add-to-cart-sauce-labs-bike-light']"));
        secondProductAddToCartButton.click();
    }

    @When("I navigate to the cart")
    public void i_navigate_to_the_cart() {
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
    }

    @Then("I should see two products in the cart")
    public void i_should_see_two_products_in_the_cart() {
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        assertEquals("The number of products in the cart is not correct", 2, cartItems.size());
    }

    @Then("the first product should be {string}")
    public void the_first_product_should_be(String productName) {
        WebElement firstCartItem = driver.findElement(By.xpath("//div[@class='cart_item'][1]//div[@class='inventory_item_name']"));
        assertEquals("The first product is incorrect", productName, firstCartItem.getText());
    }

    @Then("the second product should be {string}")
    public void the_second_product_should_be(String productName) {
        WebElement secondCartItem = driver.findElement(By.xpath("//div[@class='cart_item'][2]//div[@class='inventory_item_name']"));
        assertEquals("The second product is incorrect", productName, secondCartItem.getText());
    }
}



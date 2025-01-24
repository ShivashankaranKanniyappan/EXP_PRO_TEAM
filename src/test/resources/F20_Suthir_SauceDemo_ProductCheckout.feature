@All_Scenarios @Sauce_Demo
Feature: SD20_Suthir_SauceDemo_Add to cart product
  Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And Add to Cart products
    Then User click the Check out button
    And User fills the information firstname and lastname and postalcode
    Then User clicks the continue button
    And User navigate to the overview page
    Then user click finish buton

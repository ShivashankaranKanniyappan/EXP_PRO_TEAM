@All_Scenarios @Sauce_Demo
@suthir
Feature: Suthir_28JAN2025_SauceDemo_Multiple_Remove_Products
  Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    Then user add another product to the cart
    And user removes the product from the cart
    And Quit the browser

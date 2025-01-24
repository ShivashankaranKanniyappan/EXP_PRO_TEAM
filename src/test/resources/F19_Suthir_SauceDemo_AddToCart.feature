@All_Scenarios @Sauce_Demo
Feature: Add to cart product
  Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And Add to Cart products
    And Quit the browser

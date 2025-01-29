@All_Scenarios @Sauce_Demo
Feature: SD18_Suthir_SauceDemo_Print the Header Swag Labs
  Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And Print Header Swag Labs

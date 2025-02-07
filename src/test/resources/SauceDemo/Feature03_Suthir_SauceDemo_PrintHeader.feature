@All_Scenarios @Sauce_Demo
Feature: Suthir_28JAN2025_SauceDemo_Print_the_Header_Swag_Labs
  Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And Print Header Swag Labs

@All_Scenarios @Sauce_Demo
@suthir
Feature: Suthir_29JAN2025_Validation_of_filers

  Scenario: Filter validation
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And User select the filter option (A to Z) and take screenshot
    And User select the filter option (Z to A) and take screenshot
    And User select the filter option price (low to high) and take screenshot
    And User select the filter option price (high to low) and take screenshot
    Then page logout

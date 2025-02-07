@All_Scenarios @Sauce_Demo
Feature: Suthir_29JAN2025_Validation_of_filers

  Scenario: Filter validation
    Given User navigate to the Sauce Demo login page
    When User enter valid Username and Password
    And User should be logged in successfully
    And User select the filter option (A to Z) and take screenshot
    And User select the filter option (Z to A) and take screenshot
    And User select the filter option price (low to high) and take screenshot
    And User select the filter option price (high to low) and take screenshot
    Then page logout

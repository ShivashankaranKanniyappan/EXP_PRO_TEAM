@LoginPage
Feature: Suthir_29JAN2025_Invalid_Login_to_Sauce_Demo
  #Author: Suthir
  Scenario: UnSuccessful login with invalid credentials
    Given User navigate to the Sauce Demo login page
    When User enter invalid Username and Password
    And An error message should be displayed
    Then Quit the browser
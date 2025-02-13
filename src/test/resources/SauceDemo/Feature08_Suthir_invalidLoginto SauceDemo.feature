@All_Scenarios @Sauce_Demo
@suthir
Feature: Suthir_29JAN2025_Invalid_Login_to_Sauce_Demo
  #Author: Suthir
  Scenario: UnSuccessful login with invalid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    And An error message should be displayed
    Then Quit the browser
@All_Scenarios 
@Sauce_Demo
Feature: SD17_SauceDemo_Aarthi_Logout Sauce Demo
  Author: Aarthi

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    And User clicks the Open Menu
    Then User click the logout

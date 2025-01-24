@All_Scenarios
@Sauce_Demo
Feature: Login to Sauce Demo
  #Author: Suthir
  
  Scenario: SauceDemo Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
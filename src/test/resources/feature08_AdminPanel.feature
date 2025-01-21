@All_Scenarios
Feature: ES08_Admin Panel
  Author: Aarthi

  Scenario Outline: Delete the Manager Users
    Given user is on the login page with valid credentials
    When user clicks the Admin panel
    And user clicks manage users
    Then user delete the button

@All_Scenarios
Feature: Expleosurance08_Aarthi_Admin Panel
  Author: Aarthi

  Scenario Outline: Delete the Managed Users
    Given user is on the login page with valid credentials
    When user clicks the Admin panel
    And user clicks manage users
    Then user delete the button
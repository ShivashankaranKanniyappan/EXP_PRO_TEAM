@All_Scenarios
@DemoBlaze
Feature: Ragul_24JAN2025_DemoBlaze_User Login
  Author: Ragul

  Scenario: Successful login with valid credentials
    Given user navigate to the login page
    When user enter valid login credentials
    Then user should be redirected to the homepage
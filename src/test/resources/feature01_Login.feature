@All_Scenario
Feature: TC1_Login credentials validation for ExpleoSurance
  Author: Shiva

  Scenario: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful

@All_Scenarios
Feature: Expleosurance01_Shiva_21Jan2025_Login credentials
  Author: ShivaShankaran

  Scenario: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful
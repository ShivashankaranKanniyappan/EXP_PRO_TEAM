@All_Scenarios
Feature: Expleosurance14_Shiva_24Jan2025_Multiple Policy Delete in Dashboard
  Author: ShivaShankaran

  @newUser
  Scenario Outline: Validation of multiple policy delition
    Given User should be in login Page
    And User Clicks the delete button using common name
    Then Page should be logged out
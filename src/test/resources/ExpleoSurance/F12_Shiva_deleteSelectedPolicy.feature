@All_Scenarios
Feature: Expleosurance12_Shiva_24Jan2025_New_Delete Selected Account Created in New Insurace
  Author: ShivaShankaran

  Scenario: Vaildation of deleting the newly created in New Insurance
    Given User should be in Login Page
    When User Select the account using AccountName for delete
    And User clicks the delete button one by one
    Then Account should be deleted
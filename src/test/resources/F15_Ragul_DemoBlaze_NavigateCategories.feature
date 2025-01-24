@All_Scenarios @DemoBlaze
Feature: ES17_Ragul_Navigating to Categories
  Author: Ragul

  Scenario: User successfully navigates to the "Laptops" category
    Given the user is on the homepage
    When the user clicks on the "Laptops" category
    Then the user should see a list of products in the "Laptops" category

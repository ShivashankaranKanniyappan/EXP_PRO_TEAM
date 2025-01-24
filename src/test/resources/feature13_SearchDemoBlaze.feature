@All_Scenarios
@DemoBlaze
Feature: ES13_Ragul_Product Search
Author: Ragul

 Scenario: Add a product to the cart
    Given user is on the homepage
    When user search for "Samsung galaxy s6"
    Then user should see the product in the cart

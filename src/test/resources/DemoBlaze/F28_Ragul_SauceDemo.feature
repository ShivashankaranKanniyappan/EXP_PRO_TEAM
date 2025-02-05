@Sauce_Demo @All_Scenarios
Feature: Ragul_04Feb2025_ Advanced Interactions with Sauce Labs Website

  Scenario: Verify that all products are displayed after login with a custom user
    Given I log in as a custom user performance_glitch_user with password secret_sauce
    When I navigate to the homepage
    Then I should see a list of products displayed with the correct product details

  Scenario: Add a product to the cart, proceed to checkout, and complete the purchase
    Given I am logged into Sauce Labs
    When I add the first product to the cart
    And I proceed to checkout
    Then I should successfully complete the purchase

  Scenario: Verify the sorting functionality (Price High to Low and Low to High)
    Given I am logged into Sauce Labs
    When I sort the products by price from high to low
    Then the products should be sorted correctly from high to low
    When I sort the products by price from low to high
    Then the products should be sorted correctly from low to high
    
Scenario: Add multiple products to the cart, go to the cart, and verify the cart contents
    Given I am logged into Sauce Labs
    When I add the first product to the car
    And I add the second product to the cart
    And I navigate to the cart
    Then I should see two products in the cart
    And the first product should be "Sauce Labs Backpack"
    And the second product should be "Sauce Labs Bike Light"
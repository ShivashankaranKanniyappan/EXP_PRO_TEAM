@All_Scenarios
@DemoBlaze
Feature: FS14_DemoBlaze_Ragul_Checkout Process
Author: Ragul
   Scenario: Successfully proceed to checkout
    Given user is on the homepage
    When user have a product in my cart
    Then user should receive an order confirmation

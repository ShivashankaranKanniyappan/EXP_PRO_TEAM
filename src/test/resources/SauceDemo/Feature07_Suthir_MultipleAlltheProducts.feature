@All_Scenarios @Sauce_Demo
@suthir
Feature: Suthir_29JAN2025_Add_all_the_Products 
#Author: Suthir

  Scenario: Successful login with valid credentials
    Given User should be in Sauce Demo login page
    When User enters valid Username and Password for sauce demo
    Then User should be logged in sauce Demo page successfully
    #And Add to Cart products
    And user add all the product to the cart
    And User click the Check out button
    And User fills the information firstname and lastname and postalcode
    And User clicks the continue button
    And User navigate to the overview page
    And user click finish buton
    Then Quit the browser
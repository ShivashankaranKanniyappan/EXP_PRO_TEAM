@All_Scenarios @DemoBlaze
Feature: Ragul_29JAN2025_DemoBlaze_Website Interaction with Demo Blaze website for browsing and navigation
Author: Ragul
  #As a user
  #I want to interact with the Demo Blaze website
  #So that I can test different website functionalities.

  # Scenario 1: User navigates to the homepage and verifies elements
  Scenario: User visits the homepage and sees the correct title
    Given I open the Demo Blaze website
    Then I should see the title "STORE"

  # Scenario 2: User clicks on a category and verifies products
  Scenario: User clicks on the "Laptops" category and verifies the product list
    Given I open the Demo Blaze website
    When I click on the "Laptops" category
    Then I should see a list of laptops

  # Scenario 3: User checks the "Contact Us" page
  Scenario: User visits the "Contact Us" page and verifies the header
    Given I open the Demo Blaze website
    When I click on the "Contact" link
    Then I should see the header "Contact Us"

  # Scenario 4: User navigates to the "About Us" page and verifies content
  Scenario: User visits the "About Us" page and verifies content
    Given I open the Demo Blaze website
    When I click on the About us link
    Then I should see the text About us

  # Scenario 5: User clicks the "Home" button and returns to the homepage
  Scenario: User clicks on the "Home" button to return to the homepage
    Given I open the Demo Blaze website
    When I click on the "Home" button
    Then I should be on the homepage

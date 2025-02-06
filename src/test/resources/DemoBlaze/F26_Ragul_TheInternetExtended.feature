@Internet @All_Scenarios @DemoBlaze
Feature: Ragul_03Feb2025_herokuapp Additional Scenarios for Interaction on the Website

  Scenario: Handle JavaScript Popups and Text Entry
    Given I am on the JavaScript Prompt page
    When I click the Click for JS Prompt button
    Then I should see a prompt box with the text I am a JS prompt
    When I enter Hello World in the prompt box
    And I click OK
    Then I should see the result message containing Hello World


  Scenario: Drag and Drop Interaction
    Given I am on the Drag and Drop page
    When I drag the element A and drop it onto B
    Then A should be dropped onto B
    And the positions of A and B should be swapped

  Scenario: Navigate Between Different Pages
    Given I am on the homepage
    When I click on the Form Authentication link
    Then I should be redirected to the Form Authentication page
    When I navigate back to the homepage
    Then I should be back on the homepage

  Scenario: Verify Page Title
    Given I am on the homepag
    When I check the title of the page
    Then the title should be The Internet

  Scenario: Handle Multiple Windows
    Given I am on the Windows pag
    Then I should be switched to the new windo
    And I should see the new window's contents



  Scenario: Verify Checkboxes are Unchecked by Default
    Given I am on the Checkboxes pag
    When I verify the status of Checkbox 1
    Then Checkbox 1 should be unchecked
    When I verify the status of Checkbox 2
    Then Checkbox 2 should be unchecked


  Scenario: Verify Text on the Page
    Given I am on the homepag
    When I check for the presence of text Welcome to the Internet
    
    Scenario: Verify that content changes on page reload
    Given I navigate to the "Dynamic Content" page
    When I reload the page
    Then the dynamic content should change from the previous content
    


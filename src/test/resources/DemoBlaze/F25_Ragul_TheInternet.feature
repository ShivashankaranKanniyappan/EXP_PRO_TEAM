@Internet @All_Scenarios @DemoBlaze
Feature: Ragul_30JAN2025_herokuapp_Automating advanced features on The Internet website
Author: Ragul
  Scenario: User Login and Logout Workflow
    Given I am on the login page
    When I enter valid credentials
    Then I should be logged in and redirected to the secure area
    When I log out
    Then I should be redirected to the login page

  Scenario: Handle JavaScript Alerts and Confirmations
    Given I am on the JavaScript Alerts page
    When I click the Click for JS Alert button
    Then I should see an alert box with the text
    When I accept the alert
    Then I should see the result message

  Scenario: Interact with Dropdown and Select Options
    Given I am on the dropdown page
    When I select Option 2 from the dropdown
    Then I should see Option 2 as the selected option
    When I select Option 1 from the dropdown
    Then I should see Option 1 as the selected option

  Scenario: Work with Checkboxes
    Given I am on the Checkboxes page
    When I check the first checkbox
    Then the first checkbox should be checked
    When I uncheck the first checkbox
    Then the first checkbox should be unchecked

  Scenario: File Upload and Validation
    Given I am on the File Upload page
    When I upload a file
    Then I should see the file name displayed on the page
    And I should see the success message indicating the file was uploaded
    
    Scenario: Handle Multiple Windows
    Given I am on the Windows page
    When I open a new window by clicking the link
    Then I should be switched to the new window
    And I should see the new window's content
    
   
    

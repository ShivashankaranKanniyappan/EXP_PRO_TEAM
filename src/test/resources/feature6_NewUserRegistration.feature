#Author: Gopirajan
@All_Scenarios
Feature: Register New User

  @newUser
  Scenario Outline: Validating New User Registration
    Given User Clicks the Register New Account
    When User Enters "<Email>" "<Password>" and "<ConfirmPassword>"
    And User clicks the Register button
    Then User should get the Success Message

    Examples: 
      | Email         | Password | ConfirmPassword |
      | gopi@test.com | Gopi@1   | Gopi@1          |

  @registeredUser
  Scenario Outline: Validating Registered Users
    Given User enters the new registered "<Username>" and "<Password>"
    When User clicks the submit button
    Then It should be logged in Successfully

    Examples: 
      | Username      | Password |
      | gopi@test.com | Gopi@1   |

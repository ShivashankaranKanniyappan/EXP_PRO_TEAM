@All_Scenarios
<<<<<<< HEAD
Feature: Expleosurance07_Aarthi_22Jan2025_Register New Account
=======
Feature: Aarthi_Jan302025_SauceDemo_Register New Account
>>>>>>> d6da86ab8d3ec9df6bafe0d5d63e0ad044ec440f
Author: Aarthi

  Scenario Outline: user register the new account
    Given useris on the login page with valid credential
    When user clicks the register new account
    And user enters the "<email>" and "<password>" and "<checkpassword>"
    And user clicks Register button
    And user click Navigate to login page
    And user enters Email and Password
    Then user navigate to the dashboard page

    Examples: 
      | email             | password   | checkpassword |
      | aarthi17@gmail.com | Aarthi@123 | Aarthi@123    |

      
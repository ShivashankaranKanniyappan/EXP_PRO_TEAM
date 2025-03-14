@All_Scenarios @Adactin @suthir
Feature: Suthir_05feb2025_Adactin_Hotel_Login_Validation
  Author: Suthir

  @valid_Login
  Scenario Outline: Validation of Login Credentials
    Given User is on the Adactin Login page
    When User enters the valid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then User should be redirected to Adactin Homepage

    Examples: 
      | Username      | Password |
      | TestingSuthir | Test@123 |

  @invalid_Login
  Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg

    Examples: 
      | Username      | Password |
      | TestingSuthir | Test@12  |
      | Testing       | Test@123 |

  @empty_Login
  Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg as Enter Username or Enter password

    Examples: 
      | Username      | Password |
      | TestingSuthir |          |
      |               | Test@123 |
      |               |          |

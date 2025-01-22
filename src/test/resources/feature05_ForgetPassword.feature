#Author: Suthir
@All_Scenarios
#@ForgetPassword
Feature: ES05_Suthir_Forget password functionalities
#Author: Suthir

  @ChangePassword
  Scenario: User is changing the Password
    Given User is on the login page
    When User clicks the forget password
    Then User enters the "<EmailID>" and "<Password>" and "<ConfirmPassword>"
    And User clicks the Reset Password
    And User redirected to the login page
    And User enters the valid "<Username>" and "<Password>"
    And User clicks the login button and navigate to the dashboard page
    Then Quit the browser

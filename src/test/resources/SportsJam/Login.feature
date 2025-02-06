@All_Scenarios
Feature: Aarthi_Feb022025_sportsjam_Login
  
  Author: Aarthi

  Scenario Outline: User Login Credentials
    Given user is on the login page
    And user gives valid "<username>" and "<password">
    Then user clicks login button

    Examples: 
      | username                    | password   |
      | aarthikumaresan75@gmail.com | Aarthi@123 |

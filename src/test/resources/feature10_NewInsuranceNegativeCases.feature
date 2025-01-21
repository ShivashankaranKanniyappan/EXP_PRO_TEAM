@All_Scenarios
Feature: ES10_New Insurance Details - Negative Test Cases
  Author: ShivaShankaran

  Scenario Outline: Validating New Insurance Details - Without Fields
    Given User should be in login page
    When user clicks the New Insurance
    And User enters the "<Name>", "<Email>","<Address>","<BirthDate>"
    And User select the "<Gender>" as Male/Female
    And User select the PolicyType, Coverage, SumInsured,"<Premium>"
    And User press the sumbit button and it will show the error message
    Then It should be logged out

    Examples: 
      | Name      | Email                    | Address | BirthDate  | Premium |
      |           | ExpleoTester1@expleo.com | EXPLEO  | 02/19/1993 |    4321 |
      | ExpTester |                          | EXPLEO  | 04/19/1993 |    4313 |
      | ExpTester | ExpleoTester3@expleo.com |         | 03/01/1993 |    5645 |
      | ExpTester | ExpleoTester4@expleo.com | EXPLEO  |            |    6456 |
      | ExpTester | ExpleoTester8@expleo.com | EXPLEO  | 10/28/2000 |         |
      | ExpTester | ExpleoTester8@expleo.com | EXPLEO  | 10/28/2000 |    4321 |

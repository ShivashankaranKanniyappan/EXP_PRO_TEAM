@All_Scenarios
Feature: TC10_NewInsurance Field - Negative Scenarios
  Author: ShivaShankaran

  Scenario Outline: Validation of New Insurance Fields without Details
    Given User should be in login page
    When User Clicks the NewInsurance Tab
    And User enters all the Fields Without "<Name>", "<Email>", "<Address>", "<BirthDate>"
    And User Click the Gender male or female
    And User Select the PolicyType, Coverage, "<SumInsured>" and "<Premium>"
    Then User click the Submit button and it should show Error

    Examples: 
      | Name          | Email                   | Address | BirthDate  | SumInsured | Premium |
      |               | EXPLEOTester@expleo.com | Expleo  | 02/19/1993 |   3,00,000 |    4000 |
      | EXPLEOTester2 |                         | Expleo  | 03/01/1993 |   1,00,000 |    2000 |
      | EXPLEOTester3 | EXPLEOTester@expleo.com |         | 10/28/2000 |   3,00,000 |    4000 |
      | EXPLEOTester4 | EXPLEOTester@expleo.com | Expleo  |            |   5,00,000 |    3500 |
      | EXPLEOTester5 | EXPLEOTester@expleo.com | Expleo  | 08/05/1995 |  10,00,000 |    4000 |
      | EXPLEOTester6 | EXPLEOTester@expleo.com | Expleo  | 04/19/1993 |            |    1344 |
      | EXPLEOTester7 | EXPLEOTester@expleo.com | Expleo  | 26/06/2006 |   3,00,000 |     773 |

#Author: Aarthi
@All_Scenario
Feature: New Insurance

  Scenario Outline: user enters insurance policy details
    Given user is on the login page with valid credential
    When user clicks the New Insurance
    And user enters the "<Name>" and "<Email>" and "<Address>" and "<Birthdate>"
    And user clicks the Gender
    And user enters "<PolicyType>" and "<Coverage>" and "<SumInsured>" and "<Primium>"
    And user clicks the button
    Then user clicks the submit

    Examples: 
      | Name    | Email           | Address          | Birthdate  | PolicyType        | Coverage             | SumInsured | Primium |
      | TestAcc | Test1@gmail.com | 24,manila street | 10/28/2000 | Health Insurance  | Hospitalization cost |   1,00,000 |     543 |
      | TestAcc | Test2@gmail.com | 25,manila street | 02/28/2001 | Life Insurance    | Endowment            |   1,00,000 |     610 |
      | TestAcc | Test3@gmail.com | 23,manila street | 02/19/1993 | Health Insurance  | Hospitalization cost |   1,00,000 |     810 |
      | TestAcc | Test4@gmail.com | 28,manila street | 02/28/1998 | Vehicle Insurance | Comprehensive        |   1,00,000 |     363 |
      | TestAcc | Test5@gmail.com | 29,manila street | 10/28/2001 | Health Insurance  | Hospitalization cost |   1,00,000 |     210 |
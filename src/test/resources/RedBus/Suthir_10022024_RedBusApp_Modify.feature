@All_Scenarios
@suthir
Feature: Suthir_10022024_RedBus_BookingBus_Modify feature

  @Modify
  Scenario: Search for a bus from Chennai to Palani
    Given I am on the RedBus homepage
    When I enter "Chennai" in the source city field
    And I enter "Palani" in the destination city field
    And I select "20" as the date
    And I click on "Search Buses"
    Then I should see a list of buses from Chennai to Palani
    And Validate the page title should contain "Chennai to Palani"
    Then User click on the Modify

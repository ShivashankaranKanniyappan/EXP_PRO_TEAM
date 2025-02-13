@All_scenarios @suthir
Feature: Suthir_10022024_RedBus_BookingBus_ViewSeats feature

  @BookingBusViewSeats
  Scenario: Search for a bus from Chennai to Palani
    Given I am on the RedBus homepage
    When I enter "Chennai" in the source city field
    And I enter "Palani" in the destination city field
    And I select "20" as the date
    And I click on "Search Buses"
    Then I should see a list of buses from Chennai to Palani
    And Validate the page title should contain "Chennai to Palani"
    And User click on the bus
    Then User click on the View Seats
  
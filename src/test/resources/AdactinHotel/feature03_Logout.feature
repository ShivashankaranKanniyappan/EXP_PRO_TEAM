@All_Scenarios
@Adactin
Feature: Adactin_Suthir_06feb2025_Adactin Hotel - Search Hotel

Author: Suthir
  @search_Hotel
  Scenario Outline: Seaching the hotels validation
    Given User should be in Adactin Hotel Home page
    When User select the Location, Hotels, RoomType, NoOfRooms,
    And User Enters the checkIn and checkOut Date
    And User select AdultsPerRoom, ChildrenPerRoom and Clicks the search button
    And It should be redirected to Hotel booking page
    And User select the hotel and continue for the payment
    And User should enter the "<FirstName>", "<LastName>", "<BillingAddress>", "<CCNumber>", "<CCType>", "<ExpiryMonth>", "<ExpiryYear>", "<CVV>"
    And User click the bookNow
    And it should show the Order Number
    Then Page should be logged out

    Examples: 
      | FirstName   | LastName   | BillingAddress | CCNumber         | CCType | ExpiryMonth | ExpiryYear | CVV |
      | Suthirshana | Muniyappan | Chennai        | 5636366384729846 | VISA   | August      |       2028 | 198 |

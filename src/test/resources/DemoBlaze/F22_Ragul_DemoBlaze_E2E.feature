@All_Scenarios @DemoBlaze
Feature: Ragul_28JAN2025_DemoBlaze_Adding a Product to Cart
Author: Ragul

  Scenario Outline: Adding a product to the cart with various user inputs
    Given User should be on the Demoblaze homepage
    When user clicks on the "<Category>" category
    And user selects the "<Product>" product
    And user clicks the "Add to cart" button
    And A confirmation popup appears with the message "Product added"
    And user clicks the "OK" button on the popup
    Then The cart should contain the "<Product>"

    Examples:
      | Category  | Product        | Name       | Country  | City     | CreditCard          |
      | Laptops   | Sony vaio i5   | John Doe   | USA      | New York | 1234 5678 9012 3456 |
      | Laptops   | Sony vaio i7  | Jane Smith | UK       | London   | 2345 6789 0123 4567 |
      | Phones    | Samsung galaxy s6     | Mike Ross  | Canada   | Toronto  | 3456 7890 1234 5678 |
      | Phones    | Nokia lumia 1520 | Rachel Z.  | Australia| Sydney   | 4567 8901 2345 6789 |
      | Monitors  | Apple monitor 24  | Paul G.    | France   | Paris    | 5678 9012 3456 7890 |

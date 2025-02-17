@TP6 @Home
Feature: Home tests

  Background:
    Given The client is in practice page

  @Sliders @Success @Smoke
  Scenario: The client find three sliders on home page (1)
    When Click on Shop Menu button
    And Click on Home menu button
    Then The client verify that there are three Sliders on page

  @Arrival @Success @Smoke
  Scenario Outline: The client can navigate from each Arrival image to a product details (3)
    When Click on Shop Menu button
    And Click on Home menu button
    And Click on the Arrival Image whose order is <order>
    Then The client verify that is in the product details page where exists an Add To Basket button
    Examples:
      | order |
      | 1     |
     #| 2     | Out of stock
      | 3     |

  @ArrivalToBasket @AddToBasket @Success @Smoke
  Scenario Outline: The client can add Arrival Item to the basket (8)
    When Click on Shop Menu button
    And Click on Home menu button
    And Click on the Arrival Image whose order is <order>
    And Click on the Add to Basket button
    Then The client verify that the Book is in the Menu item with price
    And The Menu item with price has a link to the Checkout page
    Examples:
      | order |
      | 1     |
     #| 2     | Out of stock
      | 3     |
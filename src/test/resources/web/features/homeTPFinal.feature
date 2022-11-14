@TPFinal @Home
Feature: Home tests

  Background:
    Given The client is in practice page

  @FromHomeUpToPayment @Success @Smoke
  Scenario Outline: (17) The client can select an arrival item, add to the basket, go to the checkout page, and access to payment gateway page where he can view and fill his billing details and select the preferred payment option
    When Click on Shop Menu button
    And Click on Home menu button
    And Verify that there are three Arrivals on page
    And Click on the Arrival Image whose order is <order>
    And Verify that is now in the product details page where an Add To Basket button exists
    And Click on the Add to Basket button
    And Verify that the Book is in the Menu item with price
    And Click on the Menu item link which navigates to proceed to check out page
    And Verify that is shown the total and subtotal values, and total is greater than subtotal because of the taxes
    And Click on Proceed to Checkout button which navigates to payment gateway page
    Then The client can see Billing, Order, Payment gateway and Additional details in the page
    And The client can fill his billing details, can opt any available payment gateway
    And The client can add a coupon
    Examples:
      | order |
      | 1     |
     #| 2     | Out of stock
      | 3     |

  @FromHomeToConfirmation @Success @Smoke
  Scenario Outline: (17) The client can select an arrival item, add to the basket, go to the checkout page, and access to payment gateway page where he can view and fill his billing details and select the preferred payment option
    When Click on Shop Menu button
    And Click on Home menu button
    And Verify that there are three Arrivals on page
    And Click on the Arrival Image whose order is <order>
    And Verify that is now in the product details page where an Add To Basket button exists
    And Click on the Add to Basket button
    And Verify that the Book is in the Menu item with price
    And Click on the Menu item link which navigates to proceed to check out page
    And Verify that is shown the total and subtotal values, and total is greater than subtotal because of the taxes
    And Click on Proceed to Checkout button which navigates to payment gateway page
    And Verify Billing, Order, Payment gateway and Additional details in the page
    And Fill the billing details, and opt any available payment gateway
    And Click on the Place Order
    Then The client can see the Order confirmation page with Order, Bank, Customer and Billing details
    Examples:
      | order |
      | 1     |
     #| 2     | Out of stock
      | 3     |
@TPFinal @Shop
Feature: Shop tests

  Background:
    Given The client is in practice page

  @FromShopToConfirmation @Success @Smoke  @Now
  Scenario Outline: (11) The client can add to basket an item from Shop page, go to the checkout page, then to the payment gateway page where he fill billing details, and finally can see the Order confirmation page
    When Click on Shop Menu button
    And Click on the Add to basket button number '<number>'
    And Verify that the Book is in the Menu item with price
    And Click on the Menu item link which navigates to proceed to check out page
    And Verify that is shown the total and subtotal values, total is greater than subtotal due to taxes
    And Click on Proceed to Checkout button which navigates to payment gateway page
    And Fill the billing details and opt for any available payment gateway in the payment gateway page
    And Click on the Place Order button
    Then The client can see the Order confirmation page with Order, Bank and Billing details
    Examples:
      | number |
      | 2      |

  @Taxes
  Scenario Outline: (12) The client can add to basket an item from Shop page, and in the payment gateway page he can choose the country, and finally see that the taxes value is 2% for India and 5% for other countries
    When Click on Shop Menu button
    And Click on the Add to basket button number '<number>'
    And Verify that the Book is in the Menu item with price
    And Click on the Menu item link which navigates to proceed to check out page
    And Verify that is shown the total and subtotal values, total is greater than subtotal due to taxes
    And Click on Proceed to Checkout button which navigates to payment gateway page
    And Choose 'India' in the country field in Billing form
    And Verify that taxes represent 2% of the subtotal
    And Choose '<country>' in the country field in Billing form
    Then The client can see that taxes represent 5% of the subtotal
    Examples:
      | number | country   |
      | 2      | Argentina |
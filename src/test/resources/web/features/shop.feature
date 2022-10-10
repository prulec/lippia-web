@TP6
  Feature: Shop tests

    Scenario Outline: The client can filter the products in Shop page by Category (2)
      Given The client is in practice page
      When Click on Shop Menu button
      And Click on an category item number <itemNumber>
      Then The client can see only products of the selected category item number <itemNumber>
      Examples:
        | itemNumber |
        | 1          |
        | 2          |
        | 3          |

    @Now
    Scenario Outline: The client can't "Add to Basket" products with "Read more" button, and can see "Out of stock" message in Product details page (8)
      Given The client is in practice page
      When Click on Shop Menu button
      And Click on the Read more button number <number>
      Then The client can see "Out of stock" message
      And The client can't see the "Add to basket" button
      Examples:
        | number |
        | 1      |
        | 2      |

    Scenario Outline: The client can see the current price with old price strikethrough for the Sale written products (9)
      Given The client is in practice page
      When Click on Shop Menu button
      And Click on the Product Image with Sale tag number <number>
      Then The client can see the current price
      And The client can see the old price strikethrough
      Examples:
        | number |
        | 1      |
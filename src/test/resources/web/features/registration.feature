@TP6
Feature: Registration tests

  Background:
    Given The client is in practice page

  @Registration @Success @Smoke
  Scenario Outline: The client can register an account with valid email and password (1)
    When Click on the My Account Menu button
    And Enter valid unregistered email in the Register form
    And Enter password <password> in the Register form
    And Click on the Register button
    Then The client is registered successfully
    And The client is redirected to the Account page
    Examples:
      | password    |
      | !Example123 |
      | !Example456 |

  @Registration @Failed @Smoke @Now
  Scenario Outline: The client can't register an account with empty email (3 and 5)
    When Click on the My Account Menu button
    And Enter empty email in the Register form
    And Enter password <password> in the Register form
    And Click on the Register button
    Then The client is not registered
    And The client receives a warning message <message>
    Examples:
      | password    | message                              |
      | !Example123 | Please provide a valid email address |
      |             | Please provide a valid email address |
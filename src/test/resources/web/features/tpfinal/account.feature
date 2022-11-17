@TPFinal @Account
Feature: Account tests

  Background:
    Given The client is in practice page

  @AccountDetails @Success @Smoke
  Scenario Outline: (7) The client logs on and can access to the account details where he can change his password
    When Click on the My Account Menu button
    And Enter the registered email '<email>' in the Login form
    And Enter password '<password>' in the Login form
    And Click on the Login button
    And Click on the My Account Menu button
    And Click on the Account Details button
    Then The client can see account details where he can change his password also
    Examples:
      | email               | password    |
      | example1@domain.com | !Example123 |

  @Authentication @Logout @Success @Smoke  @Now
  Scenario Outline: (8) The client logs in and logs out, then he can't access to the home profile page of his account
    When Click on the My Account Menu button
    And Enter the registered email '<email>' in the Login form
    And Enter password '<password>' in the Login form
    And Click on the Login button
    And Click on the My Account Menu button
    And Click on Logout button
    Then The client can't access to the home profile page of his account without re-login
    Examples:
      | email               | password    |
      | example1@domain.com | !Example123 |
@TPFinal @Login
Feature: Login tests

  Background:
    Given The client is in practice page

  @CaseSensitive @Failed @Smoke
  Scenario Outline: (7) The client attempt to login with case changed credentials and receives an error message
    When Click on the My Account Menu button
    And Enter the registered email '<email>' with case changed in the Login form
    And Enter password '<password>' with case changed in the Login form
    And Click on the Login button
    Then The client receives an error message of incorrect username-password
    Examples:
      | email               | password    |
      | example1@domain.com | !Example123 |

  @Authentication @Logout @Success @Smoke
  Scenario Outline: (8) The client logs in and signs out, then he can't access to the home profile page of his account
    When Click on the My Account Menu button
    And Enter the registered email '<email>' in the Login form
    And Enter password '<password>' in the Login form
    And Click on the Login button
    And Click on Sign out button
    Then The client can't access to the home profile page of his account without re-login
    Examples:
      | email               | password    |
      | example1@domain.com | !Example123 |
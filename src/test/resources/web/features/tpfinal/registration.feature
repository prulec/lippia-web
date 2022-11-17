@TPFinal @Registration
Feature: Registration tests

  Background:
    Given The client is in practice page

  @AccountRegistration @EmptyPassword @Failed @Smoke
  Scenario: (4) The client can't register an account with empty password
    When Click on the My Account Menu button
    And Enter valid unregistered email in the Register form
    And Click on the Register button
    Then The registration fails showing a missing password warning message

  @AccountRegistration @EmptyEmailAndPassword @Failed @Smoke
  Scenario: (5) The client can't register an account with empty email and password
    When Click on the My Account Menu button
    And Click on the Register button
    Then The registration fails showing a missing credentials warning message
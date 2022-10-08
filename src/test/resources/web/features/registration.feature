@TP6
  Feature: Registration tests

    @Now
    Scenario Outline: The client can register an account with valid email and password (1)
      Given The client is in practice page
      When Click on the My Account Menu button
      And Enter valid unregistered email in the Register form
      And Enter password <password> in the Register form
      And Click on the Register button
      Then The client is registered successfully
      And The client is redirected to the Home page
      Examples:
        | password    |
        | !Example123 |

    Scenario Outline: The client can't register an account with empty email, or empty email and password (3 and 5)
      Given The client is in practice page
      When Click on the My Account Menu button
      And Enter empty email in the Register form
      And Enter password <password> in the Register form
      And Click on the Register button
      Then The client is not registered
      And The client receives a warning message <message>
      Examples:
        | password    | message                              |
        | !Example123 | Please provide a valid email address |
        |             |                                      |
Feature: Test the sign up flow
  I want to test sign up flow

  Scenario Outline: Validation of sign flow oe new user
    Given user on the create account page
    When user enter valid details for new user "<firstname>""<Lastname>""<Email>""<Password>""<ConfirmaPassword>"
    Then user should redirect to homepage

    Examples: 
      | firstname | Lastname | Email            | Password     | ConfirmaPassword |
      | aaaas   | bbbb  | sss123@gmail.com | acdc@12344 | acdc@12344     |

  Scenario Outline: Validation of sign in flow for register user
    Given user launches the application
    When user enters "<Email>" and "<Password>"
    And clicks the sign in button
    Then the user is redirected to the homepage
    And a welcome message is displayed

    Examples: 
      | Email            | Password     |
      | sss123@gmail.com | acdc@12344 |

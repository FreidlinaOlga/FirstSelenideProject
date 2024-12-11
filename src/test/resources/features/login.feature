Feature: Login

  Scenario: Successful Login

    Given User is on HomePage
    When User click on Login icon
    # Then User verifies Login form is displayed закомментировано
    And User enters valid data
    And User clicks on Anmelden button
    And User clicks on User icon
    Then User verifies his name

  @wrongEmail
  Scenario: Login with invalid email and correct password
    Given User is on HomePage
    When User click on Login icon
    And User enters invalid email and correct password
    And User clicks on Anmelden button
    Then User verifies login unsuccessful


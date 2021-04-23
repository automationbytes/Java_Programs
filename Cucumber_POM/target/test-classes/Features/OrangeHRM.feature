Feature: OrangeHRM
  Scenario: Login OrangeHRM

    Given the user launches URL
    Then the user verifies orange HRM Loginpage
    When the user enters username in username field
    Then the user enters password in password field
    And the user clicks on submit button
Feature: [03_Automation] - Logout
  As a user I want to make sure the user can logout

  Scenario: TC16 - Successfully logout
    Given I am already the login
    When I click the user button
    And I click the logout button
    Then I am successfully logout
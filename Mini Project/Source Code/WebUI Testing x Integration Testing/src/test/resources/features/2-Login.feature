Feature: [02_Automation] - Login
  As a user I need to login before use system feature

  Scenario: TC09 - Login using valid account
    Given I am on the login page
    When I enter valid email 8
    And I enter valid password 8
    And I click the login button
    Then I am successfully login

  Scenario: TC10 - Login using valid account but empty email
    Given I am on the login page 2
    When Email field is empty
    And I enter valid password 9
    And I click the login button 2
    Then I am failed to login 2

  Scenario: TC11 - Login using valid account but empty password
    Given I am on the login page 3
    When I enter valid email 10
    And Password field is empty
    And I click the login button 3
    Then I am failed to login 3

  Scenario: TC12 - Login using valid account but fill the email with password and fill the password with email
    Given I am on the login page 4
    When I enter email with password
    And I enter password with email
    And I click the login button 4
    Then I am failed to login 4

  Scenario: TC13 - Login using valid account but fill the email field with fullname
    Given I am on the login page 5
    When I enter email with fullname
    And I enter valid password 11
    And I click the login button 5
    Then I am failed to login 5

  Scenario: TC14 - Login using valid account but invalid email
    Given I am on the login page 6
    When I enter invalid email 2
    And I enter valid password 12
    And I click the login button 6
    Then I am failed to login 6

  Scenario: TC15 - Login without fill any field
    Given I am on the login page 7
    When I not enter email
    And I not enter password
    And I click the login button 7
    Then I am failed to login 7
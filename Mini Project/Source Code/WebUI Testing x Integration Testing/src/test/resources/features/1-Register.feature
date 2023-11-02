Feature: [01_Automation] - Register
  As a user i want to login with my registered account

  Scenario: TC01 - Register with valid data
    Given I am on the register page 1
    When I enter valid full name 1
    And I enter valid email 1
    And I enter valid password 1
    And I click register button 1
    Then I successfully register and redirected to login page 1

#  Scenario: TC02 - Register with invalid full name 2 space
#    Given I am on the register page 5
#    When I enter invalid the full name
#    And I enter valid email 5
#    And I enter valid password 5
#    Then I click register button 5

#  Scenario: TC03 - Register with invalid email 2 space
#    Given I am on the register page 6
#    When I enter valid full name 6
#    And I enter invalid the email
#    And I enter valid password 6
#    Then I click register button 6

#  Scenario: TC04 - Register with invalid password 2 space
#    Given I am on the register page 7
#    When I enter valid full name 7
#    And I enter valid email 7
#    And I enter invalid the password
#    Then I click register button 7

  Scenario: TC05 - Register without using fullname
    Given I am on the register page 2
    When I enter invalid full name
    And I enter valid email 2
    And I enter valid password 2
    And I click register button 2
    Then I failed to register and redirected to the login page 2

  Scenario: TC06 - Register without using email
    Given I am on the register page 3
    When I enter valid full name 3
    And I enter invalid email
    And I enter valid password 3
    And I click register button 3
    Then I failed to register and redirected to the login page 3

  Scenario: TC07 - Register without using password
    Given I am on the register page 4
    When I enter valid full name 4
    And I enter valid email 4
    And I enter invalid password
    And I click register button 4
    Then I failed to register and redirected to the login page 4

  Scenario: TC08 - Register with existed account
    Given I am in the register page 5
    When I enter valid full name 5
    And I enter the valid email 5
    And I enter the valid password 5
    And I click the register button 5
    Then I failed register and get warning message
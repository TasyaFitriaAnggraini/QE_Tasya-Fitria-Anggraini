Feature: Login

  Scenario: [Positive] - LOGIN_As admin I have be able to login
    Given I set POST endpoints url
    When I send POST HTTP request url
    And I received status code 201 and token

  Scenario: [Negative] - LOGIN_As admin I can't login with missing data
    Given I set wrong POST endpoints
    When Username and password is empty
    Then I receive invalid HTTP response code 400

Feature: User

  Scenario: [Positive] - USER_ GET all detail data user with valid url
    Given I GET API all detail data user with valid url
    When I GET HTTP request all detail data user with valid url
    Then I receive valid GET all detail data user response code 200

  Scenario: [Negative] - USER_GET all detail data cart with invalid url
    Given I GET API all detail data user with invalid endpoints
    When I GET HTTP request all detail data user with invalid url
    Then I receive invalid GET all detail data user response code 404

  Scenario: [Positive] - USER_GET a single user with valid endpoints
    Given I GET API single user with valid endpoints
    When I GET HTTP request single user with valid endpoints
    And I receive valid data for single user
    Then I receive valid GET single user response code 200

  Scenario: [Negative] - USER_GET a single user with invalid endpoints
    Given I GET API single user with invalid endpoints
    When I GET HTTP request single user with invalid endpoints
    And I receive invalid data for single user
    Then I receive invalid GET single user response code 404

  Scenario: [Positive] - USER_GET limit result with valid param
    Given I GET user limit result
    When I GET HTTP request with valid param
    And I receive limit result with request param
    Then I receive valid GET limit result response code 200

  Scenario: [Negative] - USER_GET limit result with invalid param
    Given I GET user limit result invalid param
    When I GET HTTP request with invalid param
    And I receive limit result with invalid request param
    Then I receive invalid GET limit result response code 404

  Scenario: [Positive] - USER_GET sort result user in descending with valid endpoint
    Given I GET API user sort result with valid endpoint
    When I GET HTTP request sort user with valid endpoint
    Then I receive valid GET sort result user descending response code 200

  Scenario: [Negative] - USER_GET sort result user in descending with invalid endpoint
    Given I GET API user sort result with invalid endpoint
    When I GET HTTP request sort user with invalid endpoint
    Then I receive invalid GET sort result user descending response code 404

  Scenario: [Positive] - USER_POST new product with valid data
    Given I access POST API user endpoints
    When I POST HTTP request with a valid data
    And I receive valid data for new user
    Then I receive an valid POST response code 200

  Scenario: [Negative] - USER_POST new product with invalid data
    Given I POST the API user endpoints invalid
    When I POST HTTP request with an invalid data
    And I failed to receive data
    Then I receive invalid POST response code 404

  Scenario: [Positive] - USER_PUT existing user with valid endpoints
    Given I PUT API user with valid endpoints
    When I PUT an HTTP request with valid endpoints
    And I receive valid data for updated user
    Then I receive valid PUT response code 200

  Scenario: [Negative] - USER_PUT existing user with invalid endpoints
    Given I PUT API user with invalid endpoints
    When I PUT an HTTP request with invalid endpoints
    And I receive invalid data for updated user
    Then I receive invalid PUT response code 404

  Scenario: [Positive] - USER_DELETE existing user with valid id
    Given I DELETE API user with valid id endpoints
    When I DELETE user HTTP request with valid id
    And I receive valid DELETE user response code 200

  Scenario: [Negative] - USER_DELETE existing user with invalid id
    Given I DELETE API user with invalid id endpoints
    When I DELETE user HTTP request with invalid id
    And I receive invalid DELETE user response code 404
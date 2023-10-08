Feature: Cart

  Scenario: [Positive] - CART_ GET all detail data cart with valid endpoints
    Given I GET API all cart with valid endpoints
    When I GET HTTP request all cart data with valid endpoints
    Then I receive valid GET all cart response code 200

  Scenario: [Negative] - CART_GET all detail data cart with invalid endpoints
    Given I GET API all cart with invalid endpoints
    When I GET HTTP request all cart data with invalid endpoints
    Then I receive invalid GET all cart response code 404

  Scenario: [Positive] - CART_GET a single cart with valid url
    Given I GET API single cart with valid url
    When I GET HTTP request single cart data with valid url
    And I receive valid data for single cart
    Then I receive valid GET single cart response code 200

  Scenario: [Negative] - CART_GET a single cart with invalid url
    Given I GET API single cart with invalid url
    When I GET HTTP request single cart data with invalid url
    And  I receive invalid data for single cart
    Then I receive invalid GET single cart response code 404

  Scenario: [Positive] - CART_GET limit result cart with valid param
    Given I GET user limit result cart with valid param
    When I GET HTTP request limit result cart with valid param
    And I receive limit result cart with request param
    Then I receive valid GET limit result cart response code 200

  Scenario: [Negative] - CART_GET limit result cart with invalid param
    Given I GET user limit result cart with invalid param
    When I GET HTTP request limit result cart with invalid param
    And I receive limit result cart with invalid request param
    Then I receive invalid GET limit result cart response code 404

  Scenario: [Positive] - CART_GET sort result cart in descending with valid endpoint
    Given I GET API sort cart result with valid endpoint
    When I GET HTTP request sort cart with valid endpoint
    Then I receive valid GET sort result cart descending response code 200

  Scenario: [Negative] - CART_GET sort result cart in descending with invalid endpoint
    Given I GET API cart sort result with invalid endpoint
    When I GET HTTP request sort cart with invalid endpoint
    Then I receive invalid GET sort result cart descending response code 404

  Scenario: [Positive] - CART_GET in date range cart with valid data
    Given I GET API in date range cart param with valid data
    When I GET HTTP request data range cart param with valid data
    And I receive valid data with data range cart param
    Then I receive valid GET data range cart response code 200

  Scenario: [Negative] - CART_GET in date range cart with invalid data
    Given I GET API in date range cart param with invalid data
    When I GET HTTP request data range cart param with invalid data
    And I receive invalid data with data range cart param
    Then I receive invalid GET data range cart response code 404

  Scenario: [Negative] - CART_GET user cart with invalid data
    Given I GET API user cart with invalid data
    When I GET HTTP request user cart with invalid data
    And I receive invalid data with user cart
    Then I receive invalid GET user cart response code 400

  Scenario: [Positive] - CART_POST new cart with valid data
    Given I POST API new cart with valid endpoints
    When I POST HTTP request with valid data cart
    And I receive valid data for new cart
    Then I receive valid POST new cart response code 200

  Scenario: [Negative] - CART_POST new cart with invalid data
    Given I POST API new cart with invalid endpoints
    When I POST HTTP request with invalid data cart
    And I receive invalid data for new cart
    Then I receive invalid POST new cart response code 404

  Scenario: [Positive] - CART_PUT existing cart with valid data
    Given I PUT cart API with valid endpoints
    When I PUT cart HTTP request with valid data cart
    And I receive valid data for updated cart
    Then I receive valid PUT cart response code 200

  Scenario: [Negative] - CART_PUT existing cart with invalid data
    Given I PUT cart API with invalid endpoints
    When I PUT cart HTTP request with invalid data cart
    And I receive invalid data for updated cart
    Then I receive invalid PUT cart response code 404

  Scenario: [Positive] - CART_DELETE existing cart with valid id
    Given I DELETE API cart with valid id endpoints
    When I DELETE cart HTTP request with valid id
    And I receive valid DELETE cart response code 200

  Scenario: [Negative] - CART_DELETE existing cart with invalid id
    Given I DELETE API cart with invalid id endpoints
    When I DELETE cart HTTP request with invalid id
    And I receive invalid DELETE cart response code 404


Feature: Product

  Scenario: [Positive] - PRODUCT_GET all detail data product
    Given I GET API all product endpoints
    When I GET HTTP request all product data
    Then I receive valid get all product HTTP response code 200

  Scenario: [Negative] - PRODUCT_GET all detail data product with invalid url
    Given I GET Wrong API all product url endpoints
    When I GET HTTP url request all product data
    Then I receive valid get all product HTTP response code 404

  Scenario: [Positive] - PRODUCT_GET a single product with valid endpoint
    Given I GET API products with valid endpoint
    When I GET HTTP request with valid endpoint
    And I receive valid data for detail product
    Then I receive valid GET response code 200

  Scenario: [Negative] - PRODUCT_GET a single product with invalid endpoint
    Given I GET API products with invalid endpoints
    When I GET HTTP request with invalid endpoint
    And I receive invalid data for detail product
    Then I receive invalid GET response code 404

  Scenario: [Positive] - PRODUCT_GET limit result product with valid param
    Given I GET user limit result product with valid param
    When I GET HTTP request limit result product with valid param
    And I receive limit result product with request param
    Then I receive valid GET limit result product response code 200

  Scenario: [Negative] - PRODUCT_GET limit result product with invalid param
    Given I GET user limit result product with invalid param
    When I GET HTTP request limit result product with invalid param
    And I receive limit result product with invalid request param
    Then I receive invalid GET limit result product response code 404

  Scenario: [Positive] - PRODUCT_GET sort result product in descending with valid endpoint
    Given I GET API sort product result with valid endpoint
    When I GET HTTP request sort product with valid endpoint
    Then I receive valid GET sort result product descending response code 200

  Scenario: [Negative] - PRODUCT_GET sort result product in descending with invalid endpoint
    Given I GET API sort product result with invalid endpoint
    When I GET HTTP request sort product with invalid endpoint
    Then I receive invalid GET sort result product descending response code 404

  Scenario: [Positive] - PRODUCT_GET all categories product with valid endpoints
    Given I GET API all categories product endpoints
    When I GET HTTP request all categories product data
    Then I receive valid GET all categories product HTTP response code 200

  Scenario: [Negative] - PRODUCT_GET all categories product with invalid endpoint
    Given I GET API all categories product data invalid endpoints
    When I GET HTTP request all categories product data invalid endpoints
    Then I receive invalid GET all categories product HTTP response code 404

  Scenario: [Positive] - PRODUCT_GET in category product with valid endpoint
    Given I GET API category product valid endpoints
    When I GET HTTP request valid category product data
    Then I receive valid GET category product response code 200

  Scenario: [Negative] - PRODUCT_GET in category product with invalid endpoint
    Given I GET API category product invalid endpoints
    When I GET HTTP request invalid category product data
    Then I receive invalid GET category product response code 404

  Scenario: [Positive] - PRODUCT_POST new product with valid data
    Given I POST API product endpoints
    When I POST HTTP request with valid data
    And I receive valid data for new product
    Then I receive valid HTTP response 200

  Scenario: [Negative] - PRODUCT_POST new product with invalid data
    Given I POST the API product endpoints
    When I POST wrong HTTP request with valid data
    Then I receive invalid response code 404

  Scenario: [Positive] - PRODUCT_PUT existing product with valid endpoints
    Given I PUT API with valid endpoints
    When I PUT HTTP request with valid endpoints
    And I receive valid data for updated product
    Then I receive valid PUT product response code 200

  Scenario: [Negative] - PRODUCT_PUT existing product with invalid endpoints
    Given I PUT API with invalid endpoints
    When I PUT HTTP request with invalid endpoints
    And I receive invalid data for updated product
    Then I receive invalid PUT response 404

  Scenario: [Positive] - PRODUCT_DELETE existing product with valid id
    Given I DELETE API product with valid id endpoints
    When I DELETE product HTTP request with valid id
    And I receive valid DELETE product response code 200

  Scenario: [Negative] - PRODUCT_DELETE existing cart with invalid id
    Given I DELETE API product with invalid id endpoints
    When I DELETE product HTTP request with invalid id
    And I receive invalid DELETE product response code 404



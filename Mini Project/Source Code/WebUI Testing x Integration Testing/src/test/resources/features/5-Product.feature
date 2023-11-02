Feature: [05_Automation] - Product
  As a user I want to select the product to do transaction

  Scenario: TC20 - Buy a product to cart
    Given I am already login in the web page
    When I choose the product item
    And I click the buy button
    And I click the cart button 1
    Then I am successfully add product to cart

  Scenario: TC21 - Buy a product to cart but without login
    Given I am already login in the web page 2
    When I choose the product item 2
    And I click the buy button 2
    And I click the cart button 2
    Then I am successfully add product to cart without login

  Scenario: TC22 - Increasing product from the cart
    Given I am already login in the web page 3
    When I choose the product item 3
    And I click the buy button 3
    And I click the cart button 3
    And I add more product item
    Then I am successfully increase product item

  Scenario: TC23 - Reducing product from the cart
    Given I am already login in the web page 4
    When I choose the product item 4
    And I click the buy button 4
    And I click the cart button 4
    And I subtract product item
    Then I am successfully reducing the product item

  Scenario: TC24 - View product details
    Given I am already login in the web page 5
    When I choose the product item 5
    And I click details button
    Then I am successfully view product details

  Scenario: TC25 - View product details without login
    Given I am already login in the web page 6
    When I choose the product item 6
    And I click details button 2
    Then I am successfully view product details without login
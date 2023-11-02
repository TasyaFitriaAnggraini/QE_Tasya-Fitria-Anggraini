Feature: [07_Automation] - Transactions
  As a user I want to buy the product with feature transaction

  Scenario: TC28 - View transaction
    Given I am already login in the web page alta
    When I do the transaction
    Then I can see user transaction history

  Scenario: TC29 - View transaction but without login
    Given I am already login in the web page alta 2
    When I click user transaction 2
    Then I am navigate to login first

  Scenario: TC30 - Pay the order
    Given I am already login in the web page alta 3
    When I add the some product to cart
    And I go to the user cart
    And I checking the product before paying
    And I click the pay button
    Then I am successfully pay the product

  Scenario: TC31 - Failed pay the order without login
    Given I am already login in the web page alta 4
    When I add the some product to cart 2
    And I go to the user cart 2
    And I checking the product before paying 2
    And I click the pay button 2
    Then I am failed pay the product and redirected to login page

  Scenario: TC32 - View user transaction in ascending order
    Given I am already login in the web page alta 5
    When I do the product transaction
    And I can see the transactions history
    And I click the ascending button
    Then I can see view user transaction in ascending order

  Scenario: TC33 - View user transaction in descending order
    Given I am already login in the web page alta 6
    When I do the product transaction 2
    And I can see the transactions history 2
    And I click the descending button
    Then I can see view user transaction in descending order

  Scenario: TC34 - Set the number of transaction history per page
    Given I am already login in the web page alta 7
    When I do the transaction 2
    And I can view the transactions history
    And I choose sort by transaction
    And I set the number of item per page
    Then I should see the history transaction item on the page

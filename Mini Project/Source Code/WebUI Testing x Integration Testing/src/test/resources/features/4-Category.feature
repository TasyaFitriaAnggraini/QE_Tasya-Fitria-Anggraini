Feature: [04_Automation] - Category
  As a user I want to check the category of product

  Scenario: TC17 - Select category
    Given I am already the web page
    When I click on the transaction button in the navigation menu
    And I select the sort by category from the dropdown menu
    Then I should be taken to a page displaying all the available clothing items for sale

  Scenario: TC18 - Clear category
    Given I am already the web page 2
    When I click the select category
    And I choose the category
    And I click on the clear button next to the category dropdown menu
    Then I should be taken back to the homepage of the web

  Scenario: TC19 - View category
    Given I am already the web page 3
    When I click the select category 2
    Then I see all listed category
Feature: [06_Automation] - Ratings
  As a user I want to rate the product after doing transaction

  Scenario: TC26 - Give product ratings
    Given I am already login in the web page 1
    When I choose the product
    And I click the details button
    And I click the star
    Then I am successfully give ratings to product

#  Scenario: TC27 - Give product ratings without login
#    Given I am already login in the web page 2
#    When I choose the product 2
#    And I click the details button 2
#    And I click the star 2
#    Then I am successfully give ratings to product without login

Feature: Web Testing UI Swag Labs
  As a user
  I want to see my home page
  So that I can update my profile

  Scenario: [Positive] - As user i have be able to success login
    Given I am on the login page
    When I enter valid username
    And I enter valid password
    And I click login button
    Then I am on the home page

  Scenario: [Negative] - Incorrect username when attempting to login
    Given I am an the login page
    When I enter an incorrect username
    And I input valid password
    And I click the login button
    Then I will get the Epic sadface error

  Scenario: [Negative] - Incorrect password when attempting to login
    Given I am the login page
    When I input valid username
    And I enter an incorrect password
    And I click an login button
    Then I will get an the Epic sadface error

  Scenario: [Positive] - Begin checkout process
    Given I am login as a standard user
    When I initiate the checkout process
    And I provide the required information, including shipping and payment details
    Then I confirm my order

  Scenario: [Negative] - Confirm error for missing postal code on checkout-step-one
    Given I am logged in as a standard user
    When I click on Continue with a missing postal code on checkout-step-one
    And I try to proceed to the next step
    Then I should receive an error message indicating that the postal code is required

  Scenario: [Positive] - Adding an item to my cart displays remove button
    Given I am logged in to the SauceDemo site
    When I add an item to my cart
    And An item is successfully added to my cart
    Then I should see a remove from cart button displayed next to the item in my cart

  Scenario: [Positive] - Adding an item to the cart updates the cart badge
    Given I am login in to the SauceDemo site
    When I add item to my cart
    Then I click cart button
    And I click continue shopping button
    And I add new item to cart
    Then I see update item in my cart

  Scenario: [Positive] - Log out of the SauceDemo Website
    Given I am already logged in to the SauceDemo site
    When I click menu
    And I click Log Out
    Then I should be directed to the main log in page
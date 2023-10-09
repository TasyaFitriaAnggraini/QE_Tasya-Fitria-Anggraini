@Login
Feature: Login
  As a user
  I want to login
  So that i can see my home page

	@SuccessLogin
	Scenario: As a user i want to login with valid email and password
		Given I am on the login page
		When I enter valid email and password
		And I click login button
		Then I am on the home page
		
	@FailedLogin	
	Scenario: As a user i should be failed to login with empty email
		Given I am already on the login page
		When I enter valid password
		And I click login button
		Then I can see alert at email field
	
	@FailedLogin	
	Scenario: As a user i want to login with valid email and password
		Given I am already on the login page
		When I enter valid email
		And I click login button
		Then I can see alert at password field
		
      
      
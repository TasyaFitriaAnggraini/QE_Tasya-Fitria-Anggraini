@Register
Feature: Register 
  As a user
  I want to register
  So that i can login with my account

	@FailedRegister
	Scenario: As a user I should be failed to register with empty name field
		Given I am on the registration page
		When I enter valid email, password, and confirm password
		And I click register button
		Then I can see alert at name field
	
	@SuccessRegister
	Scenario: As a user I have be able to register with valid data
		Given I am on the registration page
		When I enter valid name, email, password, and confirm password
		And I click register button
		And I click back to login page button
		Then I am on the login page
		
  
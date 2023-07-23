@naseem
Feature: Verification on of Employees page

	US1668: As a user, I want to access the Employees page.

	Background: User login
		Given user is on the home page
	
	@B29G39-202 @wip
	Scenario: Verification of 8 main modules
		    Given user click on Employees button
		    Then user sees the eight main modules in employee page

	@B29G39-203
	Scenario: Verification of default page under employees page
		Given user click on Employees button
		Then user sees Company Structure page is displayed as default by default

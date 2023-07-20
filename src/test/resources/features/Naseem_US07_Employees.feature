@B29G39-204
Feature: Default

	
	@B29G39-202
	Scenario: Verify the users view the following 8 modules in the Employees page.
		Given the user sign on the login page
		    Then user Verify seen Employees button after login
		    Then user Verify the  view the following 8 modules in the Employees page.
		    Then  User can see Company Structure ,Find Employee,Telephone Directory,Staff Changes and Efficiency Report
		    Then User sees Honored Employees,Birthdays and New page	

	
	@B29G39-203
	Scenario: Verify that user view the Company Structure by default after clicking the Employees Module
		Given Verify that user view the Company Structure by default after clicking the Employees Module
		#updated
@B29G39-223
Feature: Default

	
	@B29G39-206
	Scenario Outline: login with valid credentials
		When user login with valid "<username>" and "<password>"
		    Then user should see the homepage
		
		    Examples:
		      | username                      | password |
		      | hr1@cybertekschool.com        | UserUser |
		      | hr2@cybertekschool.com        | UserUser |
		
		      | helpdesk1@cybertekschool.com  | UserUser |
		      | helpdesk2@cybertekschool.com  | UserUser |
		
		      | marketing1@cybertekschool.com | UserUser |
		      | marketing2@cybertekschool.com | UserUser |	

	
	@B29G39-207
	Scenario Outline: Login verification with invalid user
		When the user login with invalid "<username>","<password>"
		    Then The user should see the error message
		
		    Examples:
		      | username               | password      |
		      | wrongUserName          | UserUser      |
		      | hr1@cybertekschool.com | wrongPassword |
		      | wrongUserName          | wrongPassword |	

	
	@B29G39-208
	Scenario Outline: Login with empty username or password
		When the user login with empty "<username>","<password>"
		Then The user should see the "Please fill out this field" error message
		
		Examples:
		| username | password |
		| wrongUserName | |
		| | wrongPassword |	

	
	@B29G39-209
	Scenario Outline: Login with invalid empty username or password
		When the user login with empty "<username>","<password>"
		Then The user should see the "Please fill out this field" error message
		
		Examples:
		| username | password |
		| wrongUserName | |
		| | wrongPassword |	

	
	@B29G39-210
	Scenario: remember me check box validation
		Then user sees remember me check box
		And remember me is clickable
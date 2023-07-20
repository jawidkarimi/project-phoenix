@B29G39-189
Feature: Default

	
	@B29G39-185
	Scenario: User views options on the Activity stream page
		Given the user is on the Activity stream page
		    When the user views the page
		    Then the user should see the following options:
		      | MESSAGE |
		      | TASK    |
		      | EVENT   |
		      | POLL    |
		      | MORE    |	

	
	@B29G39-187
	Scenario: User views options under the MORE tab
		Given the user is on the Activity stream page
		    When the user clicks on the MORE tab
		    Then the user should see the following options from more tab:
		      | File         |
		      | Appreciation |
		      | Announcement |
		      | Workflow     |
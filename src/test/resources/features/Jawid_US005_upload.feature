@B29G39-228
Feature: Default

	
	@B29G39-226
	Scenario: upload pdf file
		Given user is on the home page
		    When user click on message
		    And user click on upload file icon
		    And user upload the file
		    And user click on insert button
		    And user click on send button
		    Then user sees the same file is uploaded	

	
	@B29G39-227
	Scenario: verify Delete (x) option is working
		Given user is on the home page
		    When user click on message
		    And user click on upload file icon
		    And user upload the file
		    Then user sees the x button is appeared and enabled
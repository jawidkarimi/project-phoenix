@US004
Feature: Send messages on Message tab under Active Stream

  User Story:
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background: User login
    Given user is on the home page

  Scenario: Send message by filling out the mandatory fields
    When user clicks on Message tab
    And user writes a message in the text box
    And user verifies All employees is selected
    Then user clicks send button


  Scenario: Verify "All employees" is by default
    When user clicks on Message tab
    Then user verifies All employees is selected


  Scenario: Cancel message before sending
    When user clicks on Message tab
    And user writes a message in the text box
    And user verifies All employees is selected
    Then user clicks cancel button


  Scenario: Verify error message "The message title is not specified"
    When user clicks on Message tab
    And user clicks send button
    Then user sees message title error message


  Scenario: Verify error message "Please specify at least one person."
    When user clicks on Message tab
    And user clears All employees from recipient field
    And user clicks send button
    Then user sees specify person error message
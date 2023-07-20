
@B29G39-184
Feature: Users should be able to create poll under Active Stream tab
  User story:
  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.
#@B29G39-181
  Background:User login
    Given user is on the home page
    Given user access on Poll tab
  @B29G39-179
  Scenario: Verify delivery option
    Then user verifies All employees is selected by default

  @B29G39-180
  Scenario: Verify user can create a poll by adding questions and multiple answers.

    Then user writes a title
    And user verifies All employees is selected
    Then user click on question input box
    And user write a question
    Then user click on the first answer box
    And user write an answer
    Then user click on the second answer box
    And user write second answer
    Then user click on Add question button to add more questions.
    And user write the second question.
    Then user click on the first answer box to the second question
    And user write the first answer to the second question
    Then user click on the second answer box to the second question
    And user write the second answer to the second question
    Then user click on send button to create a poll

  @B29G39-182
  Scenario: Verify user can select "Allow multiple choice" checkbox

    When user select Allow multiple choice checkbox
    Then user can see Allow multiple choice checkbox is selected
  @B29G39-183
  Scenario: Verify error message "The message title is not specified"

    And user clicks send button
    Then user sees message title error message

  @B29G39-212
  Scenario: Verify error message "Please specify at least one person."

    And user clears All employees from recipient field
    And user clicks send button
    Then user sees specify person error message
  @B29G39-213
  Scenario: Verify error message "The question text is not specified."
    And user writes new title
    Then user verifies All employees is selected
    Then user click on the first answer box
    Then user write an answer
    And user click on send button
    Then user sees the question error message

  @B29G39-214

  Scenario: Verify error message "The question "........." has no answers."
    And user writes new title
    Then user verifies All employees is selected
    Then user click on question input box
    And user types "Java or C#?"
    Then user click on send button
    But user sees the question "Java or C#?" has no answers error message

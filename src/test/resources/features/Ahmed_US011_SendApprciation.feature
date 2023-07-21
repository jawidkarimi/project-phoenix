@qasaye
Feature: User should be able to send an appreciation by filling in the mandatory fields.
  The delivery should be to 'All employees' by default.
  User should be able to cancel sending appreciation at any time before sending.

  Background: User login
    Given user is on the home page

  @TC1 @passing
  Scenario: User should see and click the appreciation tab on home page and send message
    When User should click the more tab under the search box
    Then User should see the appreciation on drop down options
    Then User should click the appreciation on the drop down options
    Given user enters a message
    When user clicks send

  @TC2
  Scenario: User able to cancel appreciation
    Given user is on the appreciation page
    Then user enters a message
    When user should see the All employees is selected
    Then user clicks the cancel button

  @TC3 @passing
  Scenario: Verify  "All employees" is selected by default
    When user is on the appreciation page
    Then user should see the All employees is selected

  @TC4 @passing
  Scenario: Verify user should see error if no message is written
    When user is on the appreciation page
    Then user clicks send
    Then user should see The message title is not specified

  @TC5
  Scenario: Verify user should see error if no one is selected
    When user is on the appreciation page
    Given user enters a message
    Then user should uncheck All employees
    When user clicks send
    Then user should see error saying Please specify at least one person
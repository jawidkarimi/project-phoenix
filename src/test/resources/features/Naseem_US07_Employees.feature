Feature:Access Employees Page

  User Story:
  As a user, I want to access the Employees page.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario:
    Given Verify the users view the following 8 modules in the Employees page.
    Then Company Structure
    Then Find Employee
    Then Telephone Directory
    And Staff Changes
    And Efficiency Report
    Then Honored Employees
    And Birthdays
    Then New page
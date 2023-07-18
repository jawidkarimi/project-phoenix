Feature:Access Employees Page

  User Story:
  As a user, I want to access the Employees page.

  Background: User is already in the log in page
    Given the user is on the login page

   @smoke
  Scenario:Access Employees Page
    Given user Verify seen Employees button after login
   Then user Verify the  view the following 8 modules in the Employees page.
    Then  User can see Company Structure
    Then User sees Find Employee
    Then User can see Telephone Directory
    And User sees Staff Changes
    And User sees Efficiency Report
    Then User sees Honored Employees
    And User sees Birthdays
    Then User sees New page


     Scenario: Company Structure
       Given Verify that user view the Company Structure by default after clicking the Employees Module
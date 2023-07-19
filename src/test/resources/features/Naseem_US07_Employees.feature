Feature:Access Employees Page

  User Story:
  As a user, I want to access the Employees page.


  @Employee
  Scenario:Access Employees Page
    Given the user sign on the login page
    Then user Verify seen Employees button after login
    Then user Verify the  view the following 8 modules in the Employees page.
    Then  User can see Company Structure ,Find Employee,Telephone Directory,Staff Changes and Efficiency Report
    Then User sees Honored Employees,Birthdays and New page

  Scenario: Company Structure Name
    Given Verify that user view the Company Structure by default after clicking the Employees Module

       # Then User sees Find Employee
      # Then User can see Telephone Directory
      # And User sees Staff Changes
     #And User sees Efficiency Report
    # And User sees Birthdays
   # Then User sees New page





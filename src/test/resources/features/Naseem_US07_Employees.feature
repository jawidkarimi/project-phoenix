Feature:Access Employees Page

  User Story:
  As a user, I want to access the Employees page.



   @smoke
  Scenario:Access Employees Page
    Given the user sign on the login page
     Given user Verify seen Employees button after login
   Then user Verify the  view the following 8 modules in the Employees page.
    Then  User can see Company Structure ,Find Employee,Telephone Directory,Staff Changes and Efficiency Report
   # Then User sees Find Employee
   # Then User can see Telephone Directory
   # And User sees Staff Changes
    #And User sees Efficiency Report



    Then User sees Honored Employees,Birthdays and New page
   # And User sees Birthdays
   # Then User sees New page





     Scenario: Company Structure
       Given Verify that user view the Company Structure by default after clicking the Employees Module
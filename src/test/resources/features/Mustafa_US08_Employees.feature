@addDepartment
Feature: Employees Page Functions

  Scenario: All Types of Users can Access Employees Menu and Views Company Structure Text

    Given the user is logged in
    When the user navigates to the Employee menu
    Then the user can see the "Company Structure" header

  Scenario: HR User Accesses Employee Menu and Performs HR Functions
    Given the user is logged in
    And the user navigates to the Employee menu
    And the HR user can see the Add Department Button
    When the HR user clicks to Add Department Button
    Then the HR user can see the added Department in the Employees Page


@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: login with valid credentials
    When user login with valid "<username>" and "<password>"
    Then user should see the homepage

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |

      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |

      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |


  Scenario Outline: Login with invalid credential
    When the user login with invalid "<username>","<password>"
    Then The user should see the error message

    Examples:
      | username               | password      |
      | wrongUserName          | UserUser      |
      | hr1@cybertekschool.com | wrongPassword |
      | wrongUserName          | wrongPassword |


  Scenario Outline: Login with invalid empty username or password
    When the user login with empty "<username>","<password>"
    Then The user should see the "Please fill out this field" error message

    Examples:
      | username      | password      |
      | wrongUserName |               |
      |               | wrongPassword |


  Scenario: remember me check box validation
    Then user sees remember me check box
    And remember me is clickable



Feature: Verification of the profile page

  US003: As a user I should access my profile page

  @wip
  Scenario: verify the data on the profile page
    Given user should be on home page
    When user click on profile picture
    And user click on my profile option
    Then user should see tabs:General,Drive,Tasks,Calendar,Conversations on tap of the my profile page


  Scenario: Verify the email address under the General tab
    Given user should be on home page
    When user click on profile picture
    And user click on my profile option
    Then user should see email of the logged in person



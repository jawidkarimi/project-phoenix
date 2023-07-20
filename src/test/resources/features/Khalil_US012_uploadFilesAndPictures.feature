Feature: Upload files and pictures feature

  User Story:
  As a user, I should be able to upload files and pictures while sending appreciation

  @Khalil
  Scenario: User should be able to upload files and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
    Given user is on the home page
    When user click on moreTab
    And user click on appreciationButton
    And user click on upload files icon
    And user click on upload files and images icon
    And user upload the file or image
    Then user should see uploaded file or image under the text box

  Scenario: User should be able to insert the files and images into the text
    Given user is on the home page
    When user click on moreTab
    And user click on appreciationButton
    And user click on upload files icon
    And user click on upload files and images icon
    And user upload the file or image
    And user click on Insert in text icon
    Then user should see file or image in the text box

  Scenario: User should be able to remove files and images at any time before sending
    Given user is on the home page
    When user click on moreTab
    And user click on appreciationButton
    And user click on upload files icon
    And user click on upload files and images icon
    And user upload the file or image
    And user click on Insert in text icon
    And user click on the X icon
    Then user should not see file or image in the text box
Feature: upload file verification

  user story: As user, I should be able to upload files and pictures as message
  @smoke
  Scenario: upload pdf file
    Given user is on the home page
    When user click on message
    And user click on upload file icon
    And user upload the file
    And user click on insert button
    And user click on send button
    Then user sees the same file is uploaded
  @smoke @wip
  Scenario: verify delete x option is enabled after the file is attached
    Given user is on the home page
    When user click on message
    And user click on upload file icon
    And user upload the file
    Then user sees the x button is appeared and enabled

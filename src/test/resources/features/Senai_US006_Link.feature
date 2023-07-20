@login1
Feature: Testing message functionality
  User Story: As a user, I should be able to add link in message

  Background:
    #Given the user is on the login page

 @wip1

   Scenario: Verify user can add link in message
    When user enter a username
    And  user enter a password
    Then user should click Login button
    Then user should see message functionality

 Scenario: Verify user be directed to a new window
    When user click on message functionality
    Then user should see a link functionality
    When user click link button
    And  user write text name
    And  user write text link
    And  user click save button
    Then message body contain link text
    When user click send the message
    Then user should be redirected back to main page
    Then user should see the text message
    When user click on the text link
    Then new tab should open


#Scenario: User should be able to attach link to specified text.
  #Scenario: Verify user opens a new tab

  #@B29G39-221

  #Scenario: Verify user inserts a text and a link in the pop-up box
    #When user click the link
    #Then user should be directed to different box
    #When user type in text
    #And user insert a link
    #Then user should click on save button



    #Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

# //input[@placeholder='Login']
  #//input[@placeholder='Password']
  #//input[@value='Log In']


#//span[contains(text(),'Message')]
#//span[@title='Link']//i

#// Webelement linkarea = driver.findElement(By.xpath//div[@class='bx-core-adm-dialog-head'])
#//    driver.switchto().iframe(linkarea)
  #//*[@id="bx-admin-prefix"]/div[2]

#//webelement linkText = driver.findElement(By.xpath //input[@id='linkidPostFormLHE_blogPostForm-text']
#//webElement linkUrl = driver.findElement(By.xpath //input[@id='linkidPostFormLHE_blogPostForm-href']
#//webElement SaveButton = driver.findElement(By.xpath //input[@id='undefined']


#//    driver.switchto().defaultContenet.

#//WebElement actualMessage = driver.findElement(By.xpath //a[normalize-space()='google']
#// String actualmessage = actualMessage.gettext
#//String expectedMessage = linkText.gettext.

#// Assert.assertTrue(actuaMessage,expectedMessage);
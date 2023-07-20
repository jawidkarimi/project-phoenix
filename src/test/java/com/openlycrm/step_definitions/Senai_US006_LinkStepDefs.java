package com.openlycrm.step_definitions;

import com.openlycrm.pages.BasePage;
import com.openlycrm.pages.LinkPage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Senai_US006_LinkStepDefs extends LoginPage {

    LoginPage loginPage = new LoginPage();
    LinkPage linkPage = new LinkPage();

//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//
//    }

   @When("user enter a username")
    public void userEnterAUsername() {

        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));

    }

    @And("user enter a password")
    public void userEnterAPassword() {

        loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));

    }

    @Then("user should click Login button")
    public void userShouldClickLoginButton() {

        loginPage.login.click();

    }

    @Then("user should see message functionality")
    public void user_should_see_message_functionality() {

    }

    @When("user click on message functionality")
    public void user_click_on_message_functionality() {

        linkPage.messageButton.click();
    }

    @Then("user should see a link functionality")
    public void user_should_see_a_link_functionality() {

    }
    @When("user click link button")
    public void userClickLinkButton() {
        linkPage.linkButton.click();

    }

    @And("user write text name")
    public void userWriteTextName() {
       // Driver.getDriver().switchTo().frame(linkPage.messageBodyIframe);
        linkPage.linkTextBox.click();
       linkPage.linkTextBox.sendKeys("Google");
    }

    @And("user write text link")
    public void userWriteTextLink() {
        BrowserUtils.waitForClickablility(linkPage.linkUrlBox,10);
        linkPage.linkUrlBox.click();

        linkPage.linkUrlBox.sendKeys("www.google.com");
    }

    @And("user click save button")
    public void userClickSaveButton() {
        BrowserUtils.waitForClickablility(linkPage.saveLinkBtn,10);
        linkPage.saveLinkBtn.click();
    }

    @Then("message body contain link text")
    public void messageBodyContainLinkText() {

      //Driver.getDriver().switchTo().frame(linkPage.messageBodyIframe);
//       System.out.println("messagePage.linkTextInBody.getText() = " + linkPage.linkTextInBody.getText());
     Driver.getDriver().switchTo().defaultContent();

    }

    @When("user click send the message")
    public void userClickSendTheMessage() {

     linkPage.sendKeyButton.click();
    }

    @Then("user should be redirected back to main page")
    public void user_should_be_redirected_back_to_main_page() {

    }

    @Then("user should see the text message")
    public void user_should_see_the_text_message() {

    }

    @When("user click on the text link")
    public void userClickOnTheTextLink() {

        linkPage.linkTab.click();

    }

    @Then("new tab should open")
    public void newTabShouldOpen() {

       for(String each : Driver.getDriver().getWindowHandles()){

            Driver.getDriver().switchTo().window(each);
            System.out.println("Window Title: " + Driver.getDriver().getTitle());

        }
        // Assert: Title is “Google”
        String expectedTitle= "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

   }



}


package com.openlycrm.step_definitions;


import com.openlycrm.pages.LoginPage;
import com.openlycrm.pages.MessagePage;
import com.openlycrm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class uploadStepDef {

    LoginPage loginPage = new LoginPage();
    MessagePage messagePage = new MessagePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {

        loginPage.login();
    }

    @When("user click on message")
    public void user_click_on_message() {
        loginPage.messageButton.click();
    }

    @When("user click on upload file icon")
    public void user_click_on_upload_file_icon() {
        messagePage.uploadFilesIcon.click();
    }

    @When("user upload the file")
    public void user_upload_the_file() {

        messagePage.uploadFilesAndImagesLink.sendKeys("/Users/jawidkarimi/IdeaProjects/project-template/src/test/resources/fileforUploadTest.txt");

    }

    @When("user click on insert button")
    public void user_click_on_insert_button() {
        BrowserUtils.waitForInvisibilityOf(messagePage.loadingBarr);
        messagePage.insertInText.click();
    }

    @When("user click on send button")
    public void user_click_on_send_button() {
        messagePage.sendButton.click();
    }

    @Then("user sees the same file is uploaded")
    public void user_sees_the_same_file_is_uploaded() {
        String expectedLoadedFileName = "fileforUploadTest";
        String actualLoadedFileName = messagePage.loadedFile.getText();

        System.out.println("expectedLoadedFileName = " + expectedLoadedFileName);
        System.out.println("actualLoadedFileName = " + actualLoadedFileName);

        Assert.assertTrue(actualLoadedFileName.contains(expectedLoadedFileName));
    }

    @Then("user sees the x button is appeared and enabled")
    public void user_sees_the_x_button_is_appeared_and_enabled() {
        messagePage.x.isDisplayed();
        messagePage.x.isEnabled();
    }
}

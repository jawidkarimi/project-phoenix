package com.openlycrm.step_definitions;


import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.pages.MessagePage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;
import java.util.List;


public class uploadStepDef {

    LoginPage loginPage = new LoginPage();
    MessagePage messagePage = new MessagePage();

    //These steps are to make the path dynamic
    //retrieves the current project path where the application is running, ensuring that the correct project path is obtained regardless of the environment
    String projectPath = System.getProperty("user.dir");
    //the path of the file
    String filePathtxt ="src/test/resources/filesToUpload/fileforUploadTest.txt";
    //it concatenates the project path and the file path to obtain the full path of the PNG file
    String fullPathtxt = projectPath+"/"+filePathtxt;

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

        messagePage.uploadFilesAndImagesLink.sendKeys(fullPathtxt);

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

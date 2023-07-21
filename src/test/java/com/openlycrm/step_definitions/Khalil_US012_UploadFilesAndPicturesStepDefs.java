package com.openlycrm.step_definitions;

import com.openlycrm.pages.Khalil_UploadFilesAndPicturesPage;
import com.openlycrm.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Khalil_US012_UploadFilesAndPicturesStepDefs {

    LoginPage loginPage = new LoginPage();
    Khalil_UploadFilesAndPicturesPage uploadFilesAndPicturesPage = new Khalil_UploadFilesAndPicturesPage();

    String projectPath = System.getProperty("user.dir");
    String filePathtxt ="src/test/resources/filesToUpload/Cydeo_logo.jpeg";
    String fullPathtxt = projectPath+"/"+filePathtxt;

    @When("user click on moreTab")
    public void user_click_on_more() {

        loginPage.moreTab.click();
    }
    @When("user click on appreciationButton")
    public void user_click_on_appreciation() {

        uploadFilesAndPicturesPage.appreciationButton.click();
    }
    @When("user click on upload files icon")
    public void user_click_on_upload_files_icon() {
        uploadFilesAndPicturesPage.uploadFilesIcon.click();
    }

    @When("user upload the file or image")
    public void user_upload_the_file_or_image() {
        uploadFilesAndPicturesPage.uploadFilesAndImagesIcon.sendKeys(fullPathtxt);

    }
    @When("user click on Insert in text icon")
    public void user_click_on_insert_in_text_icon() {
        uploadFilesAndPicturesPage.insertInTextIcon.click();

    }
    @When("user click on the X icon")
    public void user_click_on_the_x_icon() {
        uploadFilesAndPicturesPage.theXIcon.click();

    }
    @Then("user should not see file or image in the text box")
    public void user_should_not_see_file_or_image_in_the_text_box() {
        uploadFilesAndPicturesPage.fileOrImageInTheTextBox.isDisplayed();

    }
    @Then("user should see uploaded file or image under the text box")
    public void user_should_see_uploaded_file_or_image_under_the_text_box() {
        String actualUploadFileOrImageName = uploadFilesAndPicturesPage.uploadedFileOrImageUnderTheTextBox.getText();
        String expectedUploadFileOrImageName = "Cydeo";

        System.out.println("actualUploadFileOrImageName = " + actualUploadFileOrImageName);
        System.out.println("expectedUploadFileOrImageName = " + expectedUploadFileOrImageName);

       Assert.assertTrue(actualUploadFileOrImageName.contains(expectedUploadFileOrImageName));

    }
    @Then("user should see file or image in the text box")
    public void user_should_see_file_or_image_in_the_text_box() {
        uploadFilesAndPicturesPage.fileOrImageInTheTextBox.isDisplayed();


    }


}

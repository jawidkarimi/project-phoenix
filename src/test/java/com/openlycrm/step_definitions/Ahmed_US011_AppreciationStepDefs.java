package com.openlycrm.step_definitions;

import com.openlycrm.pages.AppreciationPage;
import com.openlycrm.pages.BasePage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Ahmed_US011_AppreciationStepDefs extends BasePage{

    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    AppreciationPage appreciationPage = new AppreciationPage();
    String textmessage = "This took way too long!!!";
    //Actions actions = new Actions(Driver.getDriver());




    //    @When("User logged in and on the home page")
//    public void user_logged_in_and_on_the_home_page() {
//        loginPage.login();
//
//    }
    @When("User should click the more tab under the search box")
    public void user_should_click_the_more_tab_under_the_search_box() {

        appreciationPage.moreTab.click();
        BrowserUtils.waitFor(5);
    }
    @Then("User should see the appreciation on drop down options")
    public void user_should_see_the_appreciation_on_drop_down_options() {

        boolean appreciationIsDisplayed = appreciationPage.appreciationButton.isDisplayed();


        String expected = "Appreciation";
        Assert.assertTrue(expected,appreciationIsDisplayed);

        BrowserUtils.waitFor(10);
    }
    @Then("User should click the appreciation on the drop down options")
    public void user_should_click_the_appreciation_on_the_drop_down_options() {

        appreciationPage.appreciationButton.click();
        BrowserUtils.waitFor(10);
    }

    @Given("user enters a message")
    public void userEntersAMessage() {
        Actions action = new Actions(Driver.getDriver());

//        int xCoordinate = 500;
//        int yCoordinate = 200;
//
//        action.moveByOffset(xCoordinate,yCoordinate).perform();
        action.sendKeys(textmessage).perform();

        BrowserUtils.waitFor(5);
    }

    @When("user clicks send")
    public void userClicksSend() {

        appreciationPage.sendButton.click();
        BrowserUtils.sleep(10);
    }


    @Then("user clicks the cancel button")
    public void userClicksTheCancelButton() {
        appreciationPage.cancelButton.click();
        BrowserUtils.waitFor(10);
    }


    @When("user is on the appreciation page")
    public void userIsOnTheAppreciationPage() {

        appreciationPage.moreTab.click();
        appreciationPage.appreciationButton.click();

        BrowserUtils.waitFor(10);
    }

    @Then("user should see the All employees is selected")
    public void userShouldSeeTheAllEmployeesIsSelected() {

        Assert.assertTrue(appreciationPage.allEmployees.isDisplayed());

//        boolean actualSelected = appreciationPage.allEmployees.isDisplayed();
//        String expectedSelected = "All employess";
//
//        Assert.assertTrue(expectedSelected,actualSelected);
//
//        BrowserUtils.waitFor(10);
    }

    @Then("user should see The message title is not specified")
    public void userShouldSeeTheMessageTitleIsNotSpecified() {
        String messageDisplayed = appreciationPage.messageTitleNotSpecified.getText();
        String expectedText = "The message title is not specified";

        Assert.assertTrue(expectedText.equals(messageDisplayed));

        BrowserUtils.waitFor(10);
    }




    @Then("user should uncheck All employees")
    public void userShouldUncheckAllEmployees() {
        appreciationPage.closeAllEmployees.click();

        //BrowserUtils.waitForInvisibilityOf(closeAllEmployees);
        // BrowserUtils.waitFor(10);
    }



    @Then("user should see error saying Please specify at least one person")
    public void userShouldSeeErrorSayingPleaseSpecifyAtLeastOnePerson() {
        BrowserUtils.waitFor(10);
        //Assert.assertTrue(appreciationPage.specifyOnePersonError.isDisplayed());
////        BrowserUtils.waitFor(10);
//        String messageDisplayed = appreciationPage.specifyOnePersonError.getText();
//        String expectedText = "The message title is not specified.";
//
//        Assert.assertTrue(expectedText.equals(messageDisplayed));
//
//        BrowserUtils.waitFor(10);


        boolean specifyOnePersonErrorDisplayed = appreciationPage.specifyOnePersonError.isDisplayed();


        String expected = "Please specify at least one person.";
        Assert.assertTrue(expected,specifyOnePersonErrorDisplayed);

        BrowserUtils.waitFor(10);


    }
}


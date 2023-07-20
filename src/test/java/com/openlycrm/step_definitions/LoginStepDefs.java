package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("user is on the login page of the crm")
    public void user_is_on_the_login_page_of_the_crm() {
        System.out.println("user is already in login page");
    }

    @When("user login with valid {string} and {string}")
    public void user_login_with_valid(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("user should see the homepage")
    public void user_should_see_the_homepage() {

        BrowserUtils.verifyTitleContains("Portal");

    }

    @When("the user login with invalid {string},{string}")
    public void the_user_login_with(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("The user should see the error message")
    public void the_user_should_see_the_error_message() {

        String actualErrorMessage = loginPage.errorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @When("the user login with empty {string},{string}")
    public void the_user_login_with_empty(String username, String password) {

        loginPage.login(username,password);
    }

    @Then("The user should see the {string} error message")
    public void the_user_should_see_the_error_message(String expectedErrorMessage) {

        String actualErrMessage = loginPage.errorMessage.getText();

        Assert.assertEquals(expectedErrorMessage,actualErrMessage);

    }

    @Then("user sees remember me check box")
    public void user_sees_remember_me_check_box() {

        BrowserUtils.verifyElementDisplayed(loginPage.rememberMeMessage);
    }

    @Then("remember me is clickable")
    public void remember_me_is_clickable() {
        loginPage.rememberMeCheckBox.isEnabled();


    }


}

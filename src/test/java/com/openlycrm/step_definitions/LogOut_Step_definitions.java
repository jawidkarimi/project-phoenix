package com.openlycrm.step_definitions;

import com.openlycrm.pages.LogoutPage;
import com.openlycrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOut_Step_definitions {

    LogoutPage logoutPage = new LogoutPage();
   @Given("User is on  the profile page")
   public void user_is_on_the_profile_page() {
    }

    @Then("User enters userName")
    public void userEntersUserName() {

        logoutPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
    }

    @Then("User enters password")
    public void userEntersPassword() {

        logoutPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));
    }

    @Then("User should click login button")
    public void userShouldClickLoginButton() {

        logoutPage.login.click();

    }

    @When("User click on the profile page")
    public void user_click_on_the_profile_page() {

        logoutPage.logoutProfile.click();



    }
    @Then("user should see five options")
    public void user_should_see_five_options() {



    }
    @When("user click on log out option")
    public void user_click_on_log_out_option() {

       logoutPage.logoutSenait.click();

    }
    @Then("user should exit profile page")
    public void user_should_exit_profile_page() {

    }
    
}



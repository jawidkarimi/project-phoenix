package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.pages.ProfilePage;
import com.openlycrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class ProfileStepDefs {

    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();

    @Given("user should be on home page")
    public void user_should_be_on_home_page() {
        loginPage.login();
    }

    @When("user click on profile picture")
    public void user_click_on_profile_picture() {
       // loginPage.profileButton.click();
    }

    @When("user click on my profile option")
    public void user_click_on_my_profile_option() {
        loginPage.myProfileButton.click();
    }


    @Then("user should see tabs:General,Drive,Tasks,Calendar,Conversations on tap of the my profile page")
    public void userShouldSeeTabsGeneralDriveTasksCalendarConversationsOnTapOfTheMyProfilePage() {

        List<WebElement> actualTabs = profilePage.profileTabLists;

        for (WebElement each : actualTabs) {
            Assert.assertTrue(each.isDisplayed());
        }

    }


    @Then("user should see email of the logged in person")
    public void userShouldSeeEmailOfTheLoggedInPerson() {

        Assert.assertTrue(profilePage.loggedInEmail.isDisplayed());



    }
}

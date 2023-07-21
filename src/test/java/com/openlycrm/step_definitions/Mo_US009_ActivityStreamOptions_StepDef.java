package com.openlycrm.step_definitions;

import com.openlycrm.pages.Mo_US009_ActivityStreamOptionsPage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mo_US009_ActivityStreamOptions_StepDef extends Mo_US009_ActivityStreamOptionsPage {

    Mo_US009_ActivityStreamOptionsPage activityStreamOptionsPage = new Mo_US009_ActivityStreamOptionsPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Activity stream page")
    public void theUserIsOnTheActivityStreamPage() {
        loginPage.login("hr");
    }

    @When("the user views the page")
    public void theUserViewsThePage() {
      Driver.getDriver().getTitle();
      String expectedTitle = "Portal";
      String actualTitle =Driver.getDriver().getTitle();
      Assert.assertTrue(actualTitle.contains(expectedTitle));
    }




   @Then("the user should see the following options:")
    public void the_user_should_see_the_following_options(List<String> expctedTabsName) {

       List<WebElement> webElements = Driver.getDriver().findElements(By.xpath("//span[contains(@class, 'feed-add-post-form-link')]"));
       List<String> elements = new ArrayList<>();

        for (WebElement each : webElements) {
            elements.add(each.getText());
        }
        List<String> fiveElements= elements.stream().limit(5).collect(Collectors.toList());

        System.out.println("fiveElements = " + fiveElements);
       Assert.assertEquals(fiveElements,expctedTabsName);

    }

    @When("the user clicks on the MORE tab")
    public void theUserClicksOnTheMORETab() {
       activityStreamOptionsPage.moreTabClick.click();

    }

    @Then("the user should see the following options from more tab:")
    public void theUserShouldSeeTheFollowingOptionsFromMoreTab(List<String> expectedMoreTabElements) {

        List<WebElement> actualMoreTabwebElements = Driver.getDriver().findElements(By.xpath("//span[@class='menu-popup-item-text']"));
         List<String>    moreTabElements = new ArrayList<>();
        for (WebElement each : actualMoreTabwebElements) {

            moreTabElements.add(each.getText());
        }
         //List<String> elmentsAfterFive = moreTabElements.stream().skip(6).collect(Collectors.toList());
        System.out.println(moreTabElements);
        Assert.assertTrue(moreTabElements.equals(expectedMoreTabElements));

    }


}



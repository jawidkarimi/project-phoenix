package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.pages.MessagePage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Bonnie_US004_MessageStepDefs {

    MessagePage messagePage = new MessagePage();
    String textMessage = "Hello everyone!";
    Actions action = new Actions(Driver.getDriver());

    @When("user clicks on Message tab")
    public void user_clicks_on_message_tab() {

        messagePage.messageButton.click();
        BrowserUtils.waitFor(5);

    }

    @When("user writes a message in the text box")
    public void user_writes_a_message_in_the_text_box() {

        int xCoordinate = 500;
        int yCoordinate = 200;

        action.moveByOffset(xCoordinate, yCoordinate).perform();
        action.sendKeys(textMessage).perform();

    }

    @When("user verifies All employees is selected")
    public void user_verifies_all_employees_is_selected() {

        Assert.assertTrue(messagePage.allEmployeesText.isDisplayed());

        //BrowserUtils.verifyElementDisplayed(messagePage.allEmployeesText);
    }

    @When("user clicks send button")
    public void user_clicks_send_button() {

        messagePage.sendButton.click();
    }

    @Then("user clicks cancel button")
    public void user_clicks_cancel_button() {

        messagePage.cancelButton.click();
    }

    @Then("user sees message title error message")
    public void user_sees_message_title_error_message() {

        String expectedTitleError = "The message title is not specified";
        String actualTitleError = messagePage.messageTitleError.getText();

        Assert.assertEquals(actualTitleError, expectedTitleError);
    }

    @When("user clears All employees from recipient field")
    public void user_clears_all_employees_from_recipient_field() {

        messagePage.closeAllEmployees.click();
    }

    @Then("user sees specify person error message")
    public void user_sees_specify_person_error_message() {

        String expectedSpecifyPersonError = "Please specify at least one person.";
        String actualSpecifyPersonError = messagePage.specifyOnePersonError.getText();

        Assert.assertEquals(actualSpecifyPersonError, expectedSpecifyPersonError);
    }
}

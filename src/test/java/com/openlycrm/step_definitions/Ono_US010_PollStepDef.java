package com.openlycrm.step_definitions;

import com.openlycrm.pages.BasePage;
import com.openlycrm.pages.Ono_PollPage;
import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Ono_US010_PollStepDef extends BasePage {
    Ono_PollPage pollPage = new Ono_PollPage();
    Actions action = new Actions(Driver.getDriver());

    @Given("user access on Poll tab")
    public void user_access_on_poll_tab() {
        pollPage.pollButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user writes a title")
    public void user_writes_a_title() {
        int xCoordinate = 500;
        int yCoordinate = 200;

        action.moveByOffset(xCoordinate, yCoordinate).perform();
        action.sendKeys("Poll Title").perform();
    }

    @Then("user verifies All employees is selected by default")
    public void user_verifies_all_employees_is_selected_by_default() {

        Assert.assertTrue(pollPage.allEmployeesText.isDisplayed());
    }

    @Then("user click on question input box")
    public void user_click_on_question_input_box() {
        pollPage.questionBox0.click();
    }

    @Then("user write a question")
    public void user_write_a_question() {
        pollPage.questionBox0.sendKeys("JAVA or C#?");
    }

    @Then("user click on the first answer box")
    public void user_click_on_the_first_answer_box() {
        pollPage.answerBox0_0.click();
    }

    @Then("user write an answer")
    public void user_write_an_answer() {
        pollPage.answerBox0_0.sendKeys("JAVA");
    }

    @Then("user click on the second answer box")
    public void user_click_on_the_second_answer_box() {
        pollPage.answerBox0_1.click();
    }

    @Then("user write second answer")
    public void user_write_second_answer() {
        pollPage.answerBox0_1.sendKeys("C#");
    }

    @Then("user click on Add question button to add more questions.")
    public void user_click_on_add_question_button_to_add_more_questions() {
        pollPage.addQuestionButton.click();
    }

    @Then("user write the second question.")
    public void user_write_the_second_question() {

        pollPage.questionBox1.sendKeys("Remote or in-office?");
    }

    @Then("user click on the first answer box to the second question")
    public void user_click_on_the_first_answer_box_to_the_second_question() {
        int xCoordinate = 500;
        int yCoordinate = 100;

        action.moveByOffset(xCoordinate, yCoordinate).perform();

    }

    @Then("user write the first answer to the second question")
    public void user_write_the_first_answer_to_the_second_question() {
        pollPage.answerBox1_0.sendKeys("Remote");
    }

    @Then("user click on the second answer box to the second question")
    public void user_click_on_the_second_answer_box_to_the_second_question() {
        pollPage.answerBox1_1.click();
    }

    @Then("user write the second answer to the second question")
    public void user_write_the_second_answer_to_the_second_question() {
        pollPage.answerBox1_1.sendKeys("In-office");
    }

    @Then("user click on send button to create a poll")
    public void user_click_on_send_button_to_create_a_poll() {

        pollPage.sendButton.click();
        System.out.println("Poll is created");
    }

    @When("user select Allow multiple choice checkbox")
    public void user_select_allow_multiple_choice_checkbox() {

        pollPage.allowMultipleChoiceBox.click();

    }

    @Then("user can see Allow multiple choice checkbox is selected")
    public void user_can_see_allow_multiple_choice_checkbox_is_selected() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(pollPage.allowMultipleChoiceBox.isSelected());
    }

    @Then("user sees the question error message")
    public void user_sees_the_question_error_message() {
        String expectedQuestionError = "The question text is not specified.";
        String actualQuestionError = pollPage.questionTextError.getText();

        Assert.assertEquals(actualQuestionError, expectedQuestionError);
    }
    @And("user types {string}")
    public void userTypes(String question) {
        pollPage.questionBox0.click();
        pollPage.questionBox0.sendKeys(question);
    }
    @Then("user sees the question {string} has no answers error message")
    public void user_sees_the_question_has_no_answers_error_message(String question) {

        String expectedAnswerError = "The question \"" + question +  "\" has no answers.";
        String actualAnswerError = pollPage.questionHasNoAnswersError.getText();

        Assert.assertEquals(actualAnswerError, expectedAnswerError);
    }


    @And("user writes new title")
    public void userWritesNewTitle() {
        int xCoordinate = 500;
        int yCoordinate = 200;

        action.moveByOffset(xCoordinate, yCoordinate).perform();
        action.sendKeys("New Title").perform();
    }
}

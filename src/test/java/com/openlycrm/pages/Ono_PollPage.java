package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ono_PollPage extends BasePage {


    public Ono_PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "question_0")
    public WebElement questionBox0;
    @FindBy(id = "question_1")
    public WebElement questionBox1;

    @FindBy(id = "answer_0__0_")
    public WebElement answerBox0_0;
    @FindBy(id = "answer_0__1_")
    public WebElement answerBox0_1;
    @FindBy(id = "answer_1__0_")
    public WebElement answerBox1_0;
    @FindBy(id = "answer_1__1_")
    public WebElement answerBox1_1;


    @FindBy(xpath = "//li[@class=\"vote-block-inp-wrap\"]")
    public List<WebElement> answerBoxes;

    @FindBy(xpath = "//li[@class=\"vote-question\"]")
    public List<WebElement> questionBoxes;
}

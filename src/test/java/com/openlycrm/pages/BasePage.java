package com.openlycrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public abstract class BasePage {

    @FindBy(id = "user-name")
    public WebElement profileName;

    @FindBy (className = "menu-popup-item-text")
    public List<WebElement> profileOptions;

    @FindBy (xpath = "//span[normalize-space()='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath ="//span[text()='Message']" )
    public WebElement messageButton;

    @FindBy (xpath = "//span[text()='The message title is not specified']")
    public WebElement messageTitleError;

    @FindBy (xpath = "//span[text()='Please specify at least one person.']")
    public WebElement specifyOnePersonError;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement closeAllEmployees;

    @FindBy (xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesButton;

    @FindBy (xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImages;

    @FindBy (xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy (xpath = "//span[normalize-space()='Employees']")
    public WebElement employeesPageButton;

    @FindBy (className = "main-buttons-item-text-title")
    public List<WebElement> employeesModule;

    @FindBy (id = "pagetitle")
    public WebElement companyStructureText;

    @FindBy(xpath = "//*[@id='feed-add-post-form-tab']")  // TODO- redo locator
    public List<WebElement> activityStreamMenuBar;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(xpath = "//span[contains(text(),'Poll')]")
    public WebElement pollButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement questionTextError;

    @FindBy(xpath = "//span[contains(text(),'has no answers')]") //TODO- maybe concatenate?
    public WebElement questionHasNoAnswersError;

    @FindBy(id = "multi_0")
    public WebElement allowMultipleChoiceBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(linkText = "Add question")
    public WebElement addQuestionButton;

    @FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement appreciationButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//a[text()='Add more']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//span[normalize-space()='My Profile']")
    public WebElement myProfileButton;

    @FindBy (xpath = "//span[text()='All employees']")
    public WebElement allEmployeesText;

    @FindBy(xpath = "//div[@class='user-block']")
    public WebElement profileButton;
}

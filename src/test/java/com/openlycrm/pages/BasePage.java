package com.openlycrm.pages;




import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    /*
    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement pageSubTitle;

    @FindBy(css = "#user-menu > a")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myUser;


     */

//-----------------------------------------------------------------------


    @FindBy(id = "user-name")
    public WebElement profileName;

    @FindBy (className = "menu-popup-item-text")
    public List<WebElement> profileOptions;

    @FindBy (xpath = "//span[normalize-space()='Log out']")
    public WebElement logoutButton;

    @FindBy (xpath = "//span[contains(text(),'Message')]")
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




//-----------------------------------------------------------------------


    /*
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /**
     * @return page name, for example: Dashboard

    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */

    /*
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */

    /*
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

     */



}

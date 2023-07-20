package com.openlycrm.pages;
import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage extends BasePage {
   public AppreciationPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']")
    public WebElement tabOptions;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreTab;

    @FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement appreciationButton;

    @FindBy(className = "feed-add-post-destination-text")
    public WebElement allEmployees;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(className = "feed-add-info-text")
    public WebElement messageTitleNotSpecified;

    @FindBy(css = "span.del-but")
    public WebElement x;

}

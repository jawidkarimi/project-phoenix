package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage extends BasePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesLink;

    @FindBy(xpath = "//span[@class='feed-add-post-load-indicator']")
    public WebElement loadingBarr;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInText;

    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement uploadedFileName;

    @FindBy(css = "span.del-but")
    public WebElement x;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "(//span[@class='feed-com-file-inline feed-com-file-name'])[1]")
    public WebElement loadedFile;
}

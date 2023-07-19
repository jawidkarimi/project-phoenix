package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Khalil_UploadFilesAndPicturesPage extends BasePage {

    public Khalil_UploadFilesAndPicturesPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesIcon;

    @FindBy (className = "insert-btn-text")
    public WebElement insertInTextIcon;

    @FindBy(css = "span.del-but")
    public WebElement theXIcon;

    @FindBy(xpath = "//*[.='floppydisk (1).jpg']")
    public WebElement uploadedFileOrImageUnderTheTextBox;

    @FindBy(xpath = "//img[contains(@id,'bxid')]")
    public WebElement fileOrImageInTheTextBox;









}

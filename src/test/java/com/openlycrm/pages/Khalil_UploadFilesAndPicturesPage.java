package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Khalil_UploadFilesAndPicturesPage extends BasePage {

    public Khalil_UploadFilesAndPicturesPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesAndImages;





}

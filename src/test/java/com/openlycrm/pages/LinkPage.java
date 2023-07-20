package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LinkPage extends BasePage {
    public LinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "#bx-admin-prefix")
    public WebElement linkarea;

    @FindBy(xpath = "//*[@id=\"bx-admin-prefix\"]/div[2]")
    public WebElement TextLinkArea;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;
    //linkidPostFormLHE_blogPostForm-text

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrl;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveButtonLink;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendKeyButton;

    @FindBy(linkText = "Google")
    public WebElement linkTab;


    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement linkBtn;
    ////*[@id="bx-b-link-blogPostForm"]/span/i
    //id = "bx-b-link-blogPostForm"
    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBox;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkUrlBox;
    @FindBy(xpath = "//input[@value='Save']")
    public WebElement saveLinkBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBodyIframe;

    @FindBy(linkText = "this text in order for test")
    public WebElement linkTextInBody;

    //#bx\-b\-link\-blogPostForm

    // //input[@id='linkidPostFormLHE_blogPostForm-text'
    // //*[@id="linkidPostFormLHE_blogPostForm-text"]
// /html/body/div[7]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/input

////input[@placeholder='Link text']
    // //*[@id="bx-admin-prefix"]

}

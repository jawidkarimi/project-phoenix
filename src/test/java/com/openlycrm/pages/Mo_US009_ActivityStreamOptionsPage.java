package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mo_US009_ActivityStreamOptionsPage {

    public Mo_US009_ActivityStreamOptionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(@class, 'feed-add-post-form-link')]")
    public WebElement activityStreamMenuBar;

    @FindBy(xpath = "//*[@class='feed-add-post-form-link-text']")
    public WebElement moreTabClick;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement moreTab;

}

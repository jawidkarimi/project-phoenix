package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamOptionsPage{

    public ActivityStreamOptionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[contains(@class, 'feed-add-post-form-link')]")
    public WebElement activityStreamMenuBar; //= Driver.getDriver().findElements(By.xpath("//span[contains(@class, 'feed-add-post-form-link')]"));

    @FindBy(xpath = "//*[@class='feed-add-post-form-link-text']")
    public WebElement moreTabClick;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement moreTab; //= Driver.getDriver().findElements(By.xpath("//span[@class='menu-popup-item-text']"));

}

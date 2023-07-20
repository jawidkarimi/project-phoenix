package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='profile-menu-items']/a")
    public List<WebElement> profileTabLists;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement loggedInEmail;





}

package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends LoginPage{

    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"user-block\"]/span[1]")

    public WebElement logoutProfile;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]")

    public WebElement logoutSenait;

}

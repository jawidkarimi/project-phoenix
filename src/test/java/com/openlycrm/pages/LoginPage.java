package com.openlycrm.pages;


import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@name='USER_LOGIN']")
    public WebElement userName;



    @FindBy(xpath="//*[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement login;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        login.click();
        // verification that we logged
    }

}

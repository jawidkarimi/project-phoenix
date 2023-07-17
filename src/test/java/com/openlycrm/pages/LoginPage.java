package com.openlycrm.pages;


import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

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

    public void login() {
        userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        login.click();
    }

    public void login(String userType) {

        String username="";
        String password="";

        if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("hd")){
            username = ConfigurationReader.getProperty("hd_username");
            password = ConfigurationReader.getProperty("hd_password");
        }else if(userType.equalsIgnoreCase("mk")){
            username = ConfigurationReader.getProperty("mk_username");
            password = ConfigurationReader.getProperty("mk_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }


}

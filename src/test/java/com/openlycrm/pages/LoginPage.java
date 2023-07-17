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

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement login;

    @FindBy(css = "div.errortext")
    public WebElement errorMessage;

    @FindBy(xpath ="//label[text()='Remember me on this computer']")
    public WebElement rememberMeMessage;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement rememberMeCheckBox;

    /**
     * Needs username and password as a method parameter
     * @param userNameStr
     * @param passwordStr
     */
    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        login.click();
    }

    /**
     * No parameter is needed.It will take username and password from the configuration.properties file
     */
    public void login() {
        userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        login.click();
    }

    /**
     * Just provide the userType like: hr, hr or mk
     * @param userType
     */
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
        new LoginPage().login(username,password);
    }
}

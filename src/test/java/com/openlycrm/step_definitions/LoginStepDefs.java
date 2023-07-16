package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs {
             LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }
    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username ="";
        String password ="";

        if(userType.equalsIgnoreCase("HR1")){
            username = ConfigurationReader.getProperty("hr1_username");
            password = ConfigurationReader.getProperty("hr1_password");
        }else if(userType.equalsIgnoreCase("HR2")){
            username = ConfigurationReader.getProperty("hr2_username");
            password = ConfigurationReader.getProperty("hr2_password");
        }else if(userType.equalsIgnoreCase("HR3")){
            username = ConfigurationReader.getProperty("hr3_username");
            password = ConfigurationReader.getProperty("hr3_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

      loginPage.login(username,password);
    }





}

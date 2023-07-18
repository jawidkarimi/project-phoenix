package com.openlycrm.pages;

import com.openlycrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Naseem_Message {


    public class LoginPage extends BasePage {

        public LoginPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(className = "main-buttons-item-text-title")
        public List<WebElement> employeesModule;


    }

}









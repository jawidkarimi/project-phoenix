package com.openlycrm.pages;

import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mustafa_EmployeesPage extends BasePage{

    public Mustafa_EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@title='Employees'])[1]")
    public WebElement employeesMenuItem;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureTitle;

    @FindBy(xpath = "//a[contains(@class, 'webform-small-button-add')]")
    public WebElement addDepartmentLink;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement nameInputPopup;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButton;

    @FindBy(xpath = "(//div[@class='structure-dept-title-text'])[2]")
    public WebElement addedDepartmentName;


    public void verifyAddDepartmentButtonVisibility(String userType) {

        boolean isHR = ConfigurationReader.getProperty("hr_username").toLowerCase().startsWith("hr");

        if (isHR) {
            Assert.assertTrue("Add Department button is not displayed for HR user.",
                    addDepartmentLink.isDisplayed());
        } else {
            Assert.assertFalse("Add Department button is displayed for non-HR user.",
                    addDepartmentLink.isDisplayed());
        }
    }

    public void addDepartmentFunction(String departmentType) {
        boolean isHR = departmentType.toLowerCase().startsWith("hr");

        if (isHR) {
            addDepartmentLink.click();
            Assert.assertTrue("Department name input field is not displayed for usertype " + departmentType,
                    nameInputPopup.isDisplayed());
            nameInputPopup.sendKeys("Test Department");
            addButton.click();
            Assert.assertTrue("Added department name is not displayed.",
                    addedDepartmentName.isDisplayed());
        } else {
            System.out.println("Warning: HR Users cannot see the Add Department button.");
        }
    }


}

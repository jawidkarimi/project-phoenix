package com.openlycrm.pages;

import com.openlycrm.utilities.BrowserUtils;
import com.openlycrm.utilities.ConfigurationReader;
import com.openlycrm.utilities.Driver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Mustafa_EmployeesPage extends BasePage {

    private WebDriver driver;

    public Mustafa_EmployeesPage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesMenuItem;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructureTitle;

    @FindBy(xpath = "//a[contains(@class, 'webform-small-button-add')]")
    public WebElement addDepartmentLink;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement nameInputPopup;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addButtonInPopup;

    @FindBy(xpath = "(//div[@class='structure-dept-title-text'])[2]")
    public WebElement addedDepartmentName;

    @FindBy(xpath = "//a[@id='bx-panel-logout']")
    public WebElement logoutButton1;

    @FindBy(xpath = "//a[contains(@href,'/auth/?logout=yes')]")
    public WebElement logoutButton2;

    @FindBy(xpath = "//div[@class='user-block user-block-active']")
    public WebElement accessProfile;



    public static void waitForElementToBeReady(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    List<String> userTypes = List.of("hr", "helpdesk", "marketing");


   public void loginTest() {


        for (String userType : userTypes) {
            try {
                login(userType);
                System.out.println("Login successful for user type: " + userType);
                // Add any additional actions or assertions after successful login here
            } catch (IllegalArgumentException e) {
                System.out.println("Login failed for user type: " + userType);
                e.printStackTrace();
            } finally {
                // Logout after each login attempt
            logout();
            }
        }
    }



    String username;
    String passwordStr;

    @Test
    public void login(String userType) {
         //driver.get(ConfigurationReader.getProperty("url"));
        switch (userType.toLowerCase()) {
            case "hr":
                username = ConfigurationReader.getProperty("hr_username");
                passwordStr = ConfigurationReader.getProperty("hr_password");
                break;
            case "helpdesk":
                username = ConfigurationReader.getProperty("hd_username");
                passwordStr = ConfigurationReader.getProperty("hd_password");
                break;
            case "marketing":
                username = ConfigurationReader.getProperty("mk_username");
                passwordStr = ConfigurationReader.getProperty("mk_password");
                break;
            default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }

        userNameInput.clear();
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(passwordStr);
        loginButton.click();
    }



    public void logout() {
        try {
            // Check if the elements for Scenario 1 are seen together
            WebElement userBlockButton1 = driver.findElement(By.xpath("//a[@class='adm-header-user-block']"));
            WebElement logoutButton1 = driver.findElement(By.xpath("//a[@id='bx-panel-logout']"));

            WebElement userBlockButton2 = driver.findElement(By.xpath("//span[@class='user-name']"));
            WebElement logoutButton2 = driver.findElement(By.xpath("//a[contains(@href,'/auth/?logout=yes')]"));


            // If both elements are found, click on them
            if (userBlockButton1.isDisplayed()) {
                userBlockButton1.click();
                logoutButton1.click();
            }// If both elements are found, click on them
            else if (userBlockButton2.isDisplayed() ) {
                userBlockButton2.click();
                logoutButton2.click();
            }

        } catch (Exception e) {
            // Handle the case if the elements for Scenario 1 are not found

                System.out.println("User block and logout buttons not found. Perhaps the user is not logged in.");
            }
        }





    public void seesCompanyHeader() {



        Assert.assertTrue(companyStructureTitle.isDisplayed());

    }

    public void addButtonFunctions(String userType) {

        if(userType.toLowerCase().equals("hr")){

            nameInputPopup.sendKeys("Test Department");
            addButtonInPopup.click();
            Assert.assertTrue(addedDepartmentName.isDisplayed());
        }else{
            System.out.println("Wrong department can access to the Add Department Button");
        }

    }


}

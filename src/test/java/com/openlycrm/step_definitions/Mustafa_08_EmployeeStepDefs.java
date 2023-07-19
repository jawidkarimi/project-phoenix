package com.openlycrm.step_definitions;

import com.openlycrm.pages.BasePage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.pages.Mustafa_EmployeesPage;

import com.openlycrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Mustafa_08_EmployeeStepDefs extends BasePage {

    Mustafa_EmployeesPage employeesPage = new Mustafa_EmployeesPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.login(ConfigurationReader.getProperty("hr_username"), ConfigurationReader.getProperty("hr_password"));
    }
    @When("the user navigates to the Employee menu")
    public void the_user_navigates_to_the_employee_menu() {
        employeesPage.employeesMenuItem.click();
    }
    @Then("the user can see the Company Structure header")
    public void the_user_can_see_the_header() {

        Assert.assertTrue(employeesPage.companyStructureTitle.isDisplayed());
    }

    @Given("the HR user can see the Add Department Button")
    public void the_hr_user_can_see_the_add_department_button() {
        employeesPage.addDepartmentFunction(ConfigurationReader.getProperty("hr_username"));
    }
    @When("the HR user clicks to Add Department Button")
    public void the_hr_user_clicks_to_add_department_button() {
        employeesPage.verifyAddDepartmentButtonVisibility(ConfigurationReader.getProperty("hr_username").substring(0, 1));
    }
    @Then("the HR user can see the added Department in the Employees Page")
    public void the_hr_user_can_see_the_added_department_in_the_employees_page() {

        employeesPage.addDepartmentFunction(ConfigurationReader.getProperty("hr_username").substring(0, 1));
    }

}

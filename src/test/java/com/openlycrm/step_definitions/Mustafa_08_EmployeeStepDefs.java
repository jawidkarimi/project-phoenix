package com.openlycrm.step_definitions;

import com.openlycrm.pages.Mustafa_EmployeesPage;
import com.openlycrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Mustafa_08_EmployeeStepDefs {

    Mustafa_EmployeesPage employeesPage = new Mustafa_EmployeesPage();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {

       // employeesPage.loginTest();
        employeesPage.login("helpdesk");
    }
    @When("the user navigates to the Employee menu")
    public void the_user_navigates_to_the_employee_menu() {
         employeesPage.employeesMenuItem.click();
    }
    @Then("the user can see the Company Structure header")
    public void the_user_can_see_the_company_structure_header() {
         employeesPage.seesCompanyHeader();
    }


    @When("the HR user clicks to Add Department Button")
    public void the_hr_user_clicks_to_add_department_button() {



        employeesPage.employeesPageButton.click();
        employeesPage.addDepartmentLink.click();

    }

    @Given("HR user is logged in")
    public void hr_user_is_logged_in() {
        employeesPage.login("hr");
    }

    @Given("the HR user can see the Add Department Button")
    public void the_hr_user_can_see_the_add_department_button() {

      Assert.assertTrue(employeesPage.addDepartmentLink.isDisplayed());
    }


    @Then("the HR user can see the added Department in the Employees Page")
    public void the_hr_user_can_see_the_added_department_in_the_employees_page() {

        employeesPage.addButtonFunctions("hr");
        employeesPage.logout();
    }
}

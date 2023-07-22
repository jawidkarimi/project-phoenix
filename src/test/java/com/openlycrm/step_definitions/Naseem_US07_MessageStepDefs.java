package com.openlycrm.step_definitions;

import com.openlycrm.pages.EmployeesPage;
import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Naseem_US07_MessageStepDefs {

    EmployeesPage employeesPage = new EmployeesPage();


    @Given("user click on Employees button")
    public void user_click_on_employees_button() {
        employeesPage.employeesPageButton.click();
    }

    @Then("user sees the eight main modules in employee page")
    public void user_sees_the_eight_main_modules_in_employee_page() {

        List<WebElement> listOfCompany = Driver.getDriver().findElements(By.xpath("//span[@class='main-buttons-item-text-title']"));

        for (WebElement each : listOfCompany) {

            Assert.assertTrue(each.isEnabled());
        }
    }

    @Then("user sees Company Structure page is displayed as default by default")
    public void user_sees_Company_Structure_page_is_displayed_as_default_by_default() {
            employeesPage.companyStructureText.isDisplayed();
    }
}






package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Naseem_US07_MessageStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user Verify seen Employees button after login")
    public void userVerifySeenEmployeesButtonAfterLogIn() {
    Driver.getDriver().findElement(By.xpath("(//a[@class='menu-item-link'])[10]"));


    }
    @Then("user Verify the  view the following {} modules in the Employees page.")
    public void userVerifyTheViewTheFollowingModulesInTheEmployeesPage(int integer) {

        Driver.getDriver().findElement(By.xpath("//div[@class='main-buttons-inner-container']"));

    }

    @Then("User can see Company Structure")
    public void user_can_see_company_structure() {

    }

    @Then("User can see Telephone Directory")
    public void user_can_see_telephone_directory() {

    }
    @Then("User sees Staff Changes")
    public void user_sees_staff_changes() {

    }
    @Then("User sees Efficiency Report")
    public void user_sees_efficiency_report() {

    }
    @Then("User sees Honored Employees")
    public void user_sees_honored_employees() {

    }
    @Then("User sees Birthdays")
    public void user_sees_birthdays() {

    }
    @Then("User sees New page")
    public void user_sees_new_page() {

    }


    @Then("User sees Find Employee")
    public void userSeesFindEmployee() {
    }


    @Given("Verify that user view the Company Structure by default after clicking the Employees Module")
    public void verifyThatUserViewTheCompanyStructureByDefaultAfterClickingTheEmployeesModule() {
    }
}

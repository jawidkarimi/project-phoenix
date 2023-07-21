package com.openlycrm.step_definitions;

import com.openlycrm.pages.LoginPage;
import com.openlycrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class Naseem_US07_MessageStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("the user sign on the login page")
    public void theUserSignOnTheLoginPage() {
        loginPage.login();

    }


    @Then("user Verify seen Employees button after login")
    public void userVerifySeenEmployeesButtonAfterLogIn() {
        WebElement employeesButton = Driver.getDriver().findElement(By.xpath("(//a[@class='menu-item-link'])[10]"));
        Assert.assertTrue(employeesButton.isDisplayed());
        System.out.println("employeesButton is displayed  ");

    }

    @Then("user Verify the  view the following {} modules in the Employees page.")
    public void userVerifyTheViewTheFollowingModulesInTheEmployeesPage(int integer) {

        WebElement employeesButton = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Employees']"));
        employeesButton.click();
    }
    ////div[@class='main-buttons-inner-container']

    @Then("User can see Company Structure ,Find Employee,Telephone Directory,Staff Changes and Efficiency Report")
    public void user_can_see_company_structure_find_employee_telephone_directory_staff_changes_and_efficiency_report() {

        List<WebElement> listOfCompany = Driver.getDriver().findElements(By.xpath("//span[contains(@class,'main-buttons-item-text-title')]"));

        List<WebElement> listOfFiveElement = listOfCompany.stream().limit(5).collect(Collectors.toList());

        for (WebElement each : listOfFiveElement) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
    }

    @Then("User sees Honored Employees,Birthdays and New page")
    public void user_sees_honored_employees_birthdays_and_new_page() {

        WebElement moreButton = Driver.getDriver().findElement(By.xpath("(//a[@class='main-buttons-item-link'])[6]"));
        moreButton.click();
        List<WebElement> listOfThree = Driver.getDriver().findElements(By.xpath("(//span[normalize-space()='More'])[1]"));
        for (WebElement each : listOfThree) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }

    }





    @Given("Verify that user view the Company Structure by default after clicking the Employees Module")
    public void verifyThatUserViewTheCompanyStructureByDefaultAfterClickingTheEmployeesModule() {
        loginPage.login();
        WebElement employeesButton = Driver.getDriver().findElement(By.linkText("Employees"));
        employeesButton.click();
        WebElement CompanyStructure = Driver.getDriver().findElement(By.linkText("Company Structure"));
        Assert.assertTrue(CompanyStructure.isDisplayed());
        System.out.println("CompanyStructure is displayed = " + CompanyStructure);

        // Driver.getDriver().findElement(By.xpath("//span[@id='pagetitle']")); ////this is second Option to find CompanyStructure
       // System.out.println("Company Structure is displayed by default");






  /*
   @Then("User can see Company Structure")
    public void user_can_see_company_structure() {
        List<WebElement> listOfCompany = Driver.getDriver().findElements(By.xpath("//span[contains(@class,'main-buttons-item-text-title')]"));

        List<WebElement> listOfFiveElement= listOfCompany.stream().limit(5).collect(Collectors.toList());

        for (WebElement each : listOfFiveElement) {
            Assert.assertTrue(each.isDisplayed());

        }
        List<WebElement>listOfThree = Driver.getDriver().findElements(By.xpath("(//span[normalize-space()='More'])[1]"));
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


*/


        //  WebElement employeesButton =  Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Employees']"));
        //  employeesButton.click();
        // String actualTitle = Driver.getDriver().getTitle();
        //  String expectedTitle = "Company Structure";
        //  Assert.assertTrue(expectedTitle,true);


    }


}


////div[@id='top_menu_id_company'] this locator for all bars of employees





package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.CreateEmployeePage;
import pages.HomePage;

public class CreateEmployeeSteps extends BaseUtil {

    private CreateEmployeePage createEmployee;
    private HomePage homePage;

    public CreateEmployeeSteps () {
        createEmployee = new CreateEmployeePage();
        homePage = new HomePage();
    }

    @When("^I go to create employee link$")
    public void goToCreateEmployeeLink()  {
       homePage.scrollToCreateEmployeeLink();
    }

    @Then("^I fill employee form typing ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void iFillEmployeeFormTypingFirstNameLastNameEmailEmployeeIdAndEmployeeLeaderName(String firstName, String lastName, String email, String employeeId, String employeeLeaderName, String startMonth, String startDay, String StartYear) {
        createEmployee.createEmployee( firstName,  lastName,  email,  employeeId, employeeLeaderName, startMonth, startDay, StartYear);
    }

    @Then("^Verify employee was successfully created and navigate to employee list$")
    public void verifyEmployeeWasSuccessfullyCreatedAndNavigateToEmployeeList()  {
        createEmployee.goToEmployeeList();
        Assert.assertTrue(homePage.EmployeeInfo.isDisplayed(),"Logo should be displayed");
    }

    @Then("^Verify the employee info in the home page table ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void verifyEmployeeInfoInTable(String firstName, String lastName, String email, String employeeId, String employeeLeaderName, String startMonth, String startDay, String StartYear) {
        createEmployee.verifyEmployeeInfoInTable();
    }
}

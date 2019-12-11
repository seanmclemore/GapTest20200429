package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.CreateEmployeePage;
import pages.HomePage;

public class CreateEmployeeSteps extends BaseUtil {

    private CreateEmployeePage createEmployee;

    public CreateEmployeeSteps () {
        createEmployee = new CreateEmployeePage();
    }

    @When("^I go to create employee link$")
    public void goToCreateEmployeeLink()  {
        HomePage homePage= new HomePage();
       homePage.scrollToCreateEmployeeLink();
    }

    @Then("^I fill employee form typing ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and ([^\"]*)$")
    public void iFillEmployeeFormTypingFirstNameLastNameEmailEmployeeIdAndEmployeeLeaderName(String firstName, String lastName, String email, String employeeId, String employeeLeaderName) {
        createEmployee.createEmployee( firstName,  lastName,  email,  employeeId,  employeeLeaderName);
    }

    @Then("^Verify employee was successfully created and navigate to employee list$")
    public void verifyEmployeeWasSuccessfullyCreatedAndNavigateToEmployeeList()  {
        createEmployee.goToEmployeeList();
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.EmployeeInfo.isDisplayed(),"Logo should be displayed");
    }

    @Then("^Verify the employee info in the home page table ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and ([^\"]*)$")
    public void verifyEmployeeInfoInTable(String firstName, String lastName, String email, String employeeId, String employeeLeaderName) {
        createEmployee.verifyEmployeeInfoInTable();
    }
}

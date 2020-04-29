package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.testng.Assert;
import pages.HomePage;

public class CreateUserSteps extends BaseUtil {

    private HomePage homePage;

    public CreateUserSteps() {
        homePage = new HomePage();
    }

    @Given("^I go to create employee link$")
    public void goToCreateUserLink()  {
       homePage.addNewUser();
    }

    @When("^I fill employee form typing ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) and ([^\"]*)$")
    public void FillUserInfo(String firstName, String lastName, String userName, String userRole, String cellPhone) {
        homePage.createEmployee(firstName, lastName, userName, userRole, cellPhone);
    }

    @When("^Removing user from home page table ([^\"]*)$")
    public void RemoveInfoInTable(String userName) {
        homePage.removeUser(userName);
    }

    @Then("^Verify the user info in the home page table ([^\"]*) and ([^\"]*)$")
    public void verifyEmployeeInfoInTable(String firstName, String userName) {
      Assert.assertTrue(homePage.verifyUserCreated(firstName, userName),"user was not registered");
    }

    @Then("^Verify the user info is not in the home page table ([^\"]*) and ([^\"]*)$")
    public void verifyEmployeeInfoNoAvailableInTable(String firstName, String userName) {
        Assert.assertFalse(homePage.verifyUserCreated(firstName, userName),"user was not registered");
    }

}

package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.junit.Assert;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps extends BaseUtil {





    @Given("^I logged in with an \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_log_in_with_a_default_user(String userEmail, String userPassword)  {
        LoginPage loginPages = new LoginPage();
        loginPages.login(userEmail,userPassword);
    }

    @When("^I see the home page$")
    public void verifyHomePage()  {
        HomePage homePage= new HomePage();
        Assert.assertTrue( homePage.txtListingEmployee.isDisplayed());
    }

    @Then("^User info is displayed$")
    public void userInfoDisplayed()  {
        HomePage homePage= new HomePage();
        Assert.assertTrue( homePage.verifyUserLoggedIn());
    }


}

package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateEmployeePage;
import pages.HomePage;


public class InitializeDriver extends BaseUtil {

    @Before
    public void initialize(){
        System.out.println("Initializing driver");
        initialization();
    }

    @After
    public void cleanUp() {
        System.out.println("closing driver");
       driver.quit();
       driver=null;
    }
}

package stepDefinitions;

import BaseUtil.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class InitializeDriver extends BaseUtil {

    @Before
    public void initialize(){
        initialization();
    }

    @After
    public void cleanUp() {
       driver.quit();
       driver=null;
    }
}

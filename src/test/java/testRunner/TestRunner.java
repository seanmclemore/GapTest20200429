package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/CreateUser.feature"
        ,glue = {"stepDefinitions"},format = {"pretty", "html:target/Destination"}
        ,tags = {"@Test2"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

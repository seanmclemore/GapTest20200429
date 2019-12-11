package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},format = {"pretty", "html:target/Destination"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

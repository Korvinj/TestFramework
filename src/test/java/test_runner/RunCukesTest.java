package test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.tests.framework.WebDriverDiscovery;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/com.test/features"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = {"com.tests.step_definition", "com.tests.framework"}
)
public class RunCukesTest {
    @AfterClass
    public static void tearDown() {
        WebDriverDiscovery.getDriver().quit();
    }
}

package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RunAll",
        features = {"classpath:Feature"},
        glue = {"classpath:stepdef"},
        plugin = {"pretty", "html:target/html-reports.html"},
        dryRun = false
)
public class testRunner extends AbstractTestNGCucumberTests {
}

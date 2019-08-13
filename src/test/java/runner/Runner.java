package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "resources",
        glue = {"steps"},
        dryRun = false,
        monochrome = false
)
public class Runner extends AbstractTestNGCucumberTests {


}
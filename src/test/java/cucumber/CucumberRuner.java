package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/suites/feature",
        glue = "cucumber.stepdefenitions",
tags = "@sber")


public class CucumberRuner extends AbstractTestNGCucumberTests {

}

package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

@CucumberOptions(
        plugin = "json:target/cucumber-report.json",
        features = "src/test/resources/suites/feature",
        glue = "cucumber.stepdefenitions",
tags = "@sber")


public class CucumberRunerTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void init() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}

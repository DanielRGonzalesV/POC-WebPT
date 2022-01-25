package com.webpt.reportAnalytics.web.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Cucumber runner.
 */
@CucumberOptions(
        plugin = {"pretty", "json:report/cucumber.json", "junit:report/cucumber.xml",
                "html:report/cucumber-html-report", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        features = {"src/test/resources/features"},
        glue = {"com.webpt.reportAnalytics.web"},
        strict = true)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}

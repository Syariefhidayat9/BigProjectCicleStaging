package com.Dayat.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/BlastdReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/featureBlast",
        glue = {"com/Dayat/stepdefs"},
        monochrome = true,
        dryRun = false
//        tags = "@Positive-Add-New-Blast"
)
public class testRunner extends AbstractTestNGCucumberTests {
}

package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json","html:target/cucumber-report.html","rerun:target/rerun.txt","me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com/trycloud/step_definitions",
        dryRun = false,
        tags = "",
        publish = true //generate report with a public link

)

public class TestRunner { }

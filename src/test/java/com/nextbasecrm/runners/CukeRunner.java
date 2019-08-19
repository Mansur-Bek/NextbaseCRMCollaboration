package com.nextbasecrm.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
                 tags = {"@uploadFile"},
                 glue = {"com/nextbasecrm/step_definitions"},
                 dryRun = false
)


public class CukeRunner {
}

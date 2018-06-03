package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by Kunle on 01/06/2018.
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features"}, format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "com/stepdefs",
        tags = "@regression")
public class TestRunner {
}

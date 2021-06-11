package com.lms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue="com.lms.steps",
		//dryRun=true,
		monochrome = true,
		tags = "@smoke",
		plugin = {"pretty"}
		)
public class TestRunner {
	

}

package com.lms.steps;

import com.lms.utils.CommonMethods;
import com.lms.utils.PageInitializer;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		CommonMethods.setUp();
		PageInitializer.initializePageObjects();
	}

	@After
	public void end(Scenario scenario) {
		CommonMethods.tearDown();
	}
}

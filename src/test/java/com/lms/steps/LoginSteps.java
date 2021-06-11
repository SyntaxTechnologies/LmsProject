package com.lms.steps;

import org.junit.Assert;

import com.lms.pages.HomePage;
import com.lms.pages.LoginPage;
import com.lms.utils.CommonMethods;
import com.lms.utils.ConfigReader;
import com.lms.utils.PageInitializer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("user enters valid username and password")
	public void enterTeacherCredentials() {
		
		sendText(login.userEmail, ConfigReader.getPropertyValue("username"));
		sendText(login.password, ConfigReader.getPropertyValue("password"));
	}

	@When("user clicks on login in button")
	public void user_clicks_on_login_in_button() {

		click(login.loginBtn);
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {

		Assert.assertTrue(displayed(home.logoutBtn));
	}

	@Then("logo and login text {string} is displayed")
	public void logoValidation(String expectedText) {
		
		Assert.assertTrue(displayed(login.logo));
		String actual = login.loginText.getText();
		Assert.assertEquals("Text is not matched", expectedText, actual);
	}
}

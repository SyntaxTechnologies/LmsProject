package com.lms.steps;

import org.junit.Assert;

import com.lms.pages.HomePage;
import com.lms.pages.LoginPage;
import com.lms.utils.CommonMethods;
import com.lms.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("user navigated to lms application")
	public void login() {
		setUp();
	}

	@When("user enters valid username and password")
	public void enterTeacherCredentials() {
		LoginPage login = new LoginPage();
		sendText(login.userEmail, ConfigReader.getPropertyValue("username"));
		sendText(login.password, ConfigReader.getPropertyValue("password"));
	}

	@When("user clicks on login in button")
	public void user_clicks_on_login_in_button() {

		LoginPage loginPage = new LoginPage();
		click(loginPage.loginBtn);
	}

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {

		HomePage homePage = new HomePage();
		Assert.assertTrue(displayed(homePage.logoutBtn));
		tearDown();
	}

	@Then("logo and login text is displayed")
	public void logoValidation() {
		LoginPage login = new LoginPage();
		Assert.assertTrue(displayed(login.logo));
		
		String expectedText = "Dear user, log in to access the admin area!";
		String actual=login.loginText.getText();
		
		Assert.assertEquals("Text is not matched", expectedText,actual );
	}
}

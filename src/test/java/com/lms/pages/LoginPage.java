package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.utils.CommonMethods;

public class LoginPage extends CommonMethods {

	@FindBy(id = "user_email")
	public WebElement userEmail;

	@FindBy(id = "user_password")
	public WebElement password;

	@FindBy(xpath = "//button [@type='submit']")
	public WebElement loginBtn;

	@FindBy(xpath = "//a[@class='logo']/img")
	public WebElement logo;
	
	@FindBy(xpath = "//p[@class= 'description']")
	public WebElement loginText;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}

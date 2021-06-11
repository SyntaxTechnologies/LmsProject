package com.lms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.utils.CommonMethods;

public class HomePage extends CommonMethods{
	
	@FindBy(xpath = "//button [@type='submit']")
	public WebElement logoutBtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}

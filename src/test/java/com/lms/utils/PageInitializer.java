package com.lms.utils;

import com.lms.pages.HomePage;
import com.lms.pages.LoginPage;

public class PageInitializer {
	
	public static LoginPage login;
	public static HomePage home;
	
	public static void initializePageObjects() {
		
		login=new LoginPage();
		home=new HomePage();
		
	}

}

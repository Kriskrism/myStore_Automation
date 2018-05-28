package com.automationpractise.myStore.index;

import org.openqa.selenium.WebDriver;

import com.automationpractise.myStore.pages.SignIn;
import com.automationpractise.myStore.testBase.TestBase;

public class TC_002verifywithIvalidCredentials extends TestBase {
	
	WebDriver  driver;
	SignIn signIn;
	
	public void start() {
		init();
	}
	
	public void verifywithIvalidCredentials() {
		signIn = new SignIn(driver);
		signIn.clickSignIn();
	}
	
	
}

package com.automationpractise.myStore.index;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationpractise.myStore.pages.SignIn;
import com.automationpractise.myStore.testBase.TestBase;

public class TC001_verifywithvalidCredentials extends TestBase{
	
	
	SignIn signIn;
	
	public void start() {
	init();
	}

@Test
	public void clickSignIn() {
	
	signIn = new SignIn(driver);
		signIn.clickSignIn();
	}

/*@AfterTest
	public void end() {
	close();
}*/
}

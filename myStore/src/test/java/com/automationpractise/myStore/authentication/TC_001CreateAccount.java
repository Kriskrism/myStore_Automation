package com.automationpractise.myStore.authentication;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractise.myStore.pages.Authentication_SignUp;
import com.automationpractise.myStore.pages.SignIn;
import com.automationpractise.myStore.testBase.TestBase;

public class TC_001CreateAccount extends TestBase{
	
	
	Authentication_SignUp signup;
	SignIn signin;
	
	//insert using dataprovider
	@Test
	public void CreateAccount() {
		signin = new SignIn(driver);
		signin.clickSignIn();
		signup = new Authentication_SignUp(driver);
		signup.createAccount("qaexecution1088@gmail.com");
		
	}

}

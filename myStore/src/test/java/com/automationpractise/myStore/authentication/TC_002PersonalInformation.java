package com.automationpractise.myStore.authentication;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automationpractise.myStore.pages.Authentication_SignUp;
import com.automationpractise.myStore.pages.PersonalInformation;
import com.automationpractise.myStore.pages.SignIn;
import com.automationpractise.myStore.testBase.TestBase;

public class TC_002PersonalInformation extends TestBase{
	
	PersonalInformation info;
	SignIn signin;
	Authentication_SignUp signup;
	
	public void startTest() {
		init();
	}
	
	@DataProvider(name = "profileDetails")
	public String[][] getTestData() {
		String[][] testRecords = getExcelData("TestData.xlsx", "Profile_DetailsField");
		return testRecords;
	}
	
	//read data from excel and fill the profile fields
	@Test(dataProvider = "profileDetails")
	public void fillDetails(String[] elemts) {
		signin = new SignIn(driver);
		signin.clickSignIn();
		signup = new Authentication_SignUp(driver);
		signup.createAccount("abc.d3.mail@email.com");
		info  = new PersonalInformation(driver);
		info.enterProfileDetails(elemts);
	}

}

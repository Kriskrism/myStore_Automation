package com.automationpractise.myStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.myStore.testBase.TestBase;

public class SignIn extends TestBase{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='login' and contains(text(),'Sign in')]")
	WebElement signIn;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignIn() {
		signIn.click();
	}

}

package com.automationpractise.myStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.myStore.testBase.TestBase;

public class Authentication_SignUp extends TestBase {
	
	WebDriver driver;
	
	@FindBy(id="email_create")
	WebElement emailAddress;
	
	@FindBy(id="SubmitCreate")
	WebElement createAccountBtn;
	
	public Authentication_SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void createAccount(String email) {
		emailAddress.clear();
		emailAddress.sendKeys(email);
		createAccountBtn.click();
	}

}

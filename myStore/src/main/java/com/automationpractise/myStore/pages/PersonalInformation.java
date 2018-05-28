package com.automationpractise.myStore.pages;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractise.myStore.testBase.TestBase;
import com.automationpractise.myStore.utilities.GenericMethods;

public class PersonalInformation extends TestBase{
	
	WebDriver driver;
	GenericMethods genMethods;
	
	String[][] excelValues;
	
	@FindBy(xpath = "//div[@id = \"noSlide\"]//h1[contains(text(), 'Create an account')]")
	WebElement create_An_Account_Label;
	
	@FindBy(xpath = "//form[@id = 'account-creation_form']/div/h3[contains(text(), \"Your personal information\")]")
	WebElement personal_Information_label;
	
	@FindBy(xpath = "//div[@id = \"uniform-id_gender1\"]")
	WebElement title_Mr;
	
	@FindBy(xpath = "//div[@id = \"uniform-id_gender2\"]")
	WebElement title_Mrs;
	
	@FindBy(id = "customer_firstname")
	WebElement customer_firstName;
	
	@FindBy(id = "customer_lastname")
	WebElement customer_lastName;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement dob_days;
	
	@FindBy(id="months")
	WebElement dob_month;
	
	@FindBy(id="years")
	WebElement dob_years;
	
	@FindBy(id = "firstname")
	WebElement firstName;
	
	@FindBy(id = "lastname")
	WebElement lastName;
	
	@FindBy(id = "company")
	WebElement company;
	
	@FindBy(id = "address1")
	WebElement address1;
	
	@FindBy(id = "address2")
	WebElement address2;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "postcode")
	WebElement postalCode;
	
	@FindBy(id = "id_country")
	WebElement country;
	
	@FindBy(id = "other")
	WebElement additionalInformation;
	
	@FindBy(id = "phone")
	WebElement homePhone;
	
	@FindBy(id = "phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(id = "alias")
	WebElement addressAlias;
	
	@FindBy(xpath = "")
	WebElement registerBtn;
	
	
	public PersonalInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<WebElement> elementList() {
		
		//creating an arraylist of web elements
		
		ArrayList<WebElement> profile_details_List = new ArrayList<WebElement>();
		profile_details_List.add(title_Mrs);
		profile_details_List.add(firstName);
		profile_details_List.add(lastName);
		profile_details_List.add(email);
		profile_details_List.add(password);
		profile_details_List.add(dob_days);
		profile_details_List.add(dob_month);
		profile_details_List.add(dob_years);
		profile_details_List.add(company);
		profile_details_List.add(address1);
		profile_details_List.add(address2);
		profile_details_List.add(city);
		profile_details_List.add(state);
		profile_details_List.add(postalCode);
		profile_details_List.add(country);
		profile_details_List.add(additionalInformation);
		profile_details_List.add(homePhone);
		profile_details_List.add(mobilePhone);
		profile_details_List.add(addressAlias);
			
			return profile_details_List;
				
			}
		
	
	public void enterProfileDetails(String[] elements) {
		String[] excelFields = elements;
		 ArrayList<WebElement> profileDetails = elementList();
		 Iterator<WebElement> itr = profileDetails.iterator();
		 
		 try {
			 while(itr.hasNext()) {
				 for(int i = 0; i <= excelFields.length; i ++) {
					 //check if any of the fields is a dropdown field, then select the element by value
					 
					 if(profileDetails.get(i).equals(country)||profileDetails.get(i).equals(state)) {
						GenericMethods.getList(excelFields[i], profileDetails.get(i));
						 }
					 //check if the object is radio field, then click on it
					 else if(profileDetails.get(i).equals(title_Mr)|| profileDetails.get(i).equals(title_Mrs))
					 		{
							 profileDetails.get(i).click();
						 }
					 //if a text box then enter the value
					 else
					 profileDetails.get(i).clear();
					 profileDetails.get(i).sendKeys(excelFields[i]);
					 itr.next();}
					 
				 
			 
			 	}
		 	}catch(Exception e) {
		 		e.getMessage();
		 	}
	}
	}
	
	



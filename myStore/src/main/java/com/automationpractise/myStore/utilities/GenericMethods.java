package com.automationpractise.myStore.utilities;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	
	WebDriver driver;
	WebElement element;
	
	public static String getValue(String Key) {
		String value = null;
		
		try {
		FileReader reader = new FileReader(new File("C:\\Users\\krishnaraj\\Desktop\\GitProjects\\myStore\\src\\main\\java\\com\\automationpractise\\myStore\\config\\propertiesFile"));
		Properties prop = new Properties();
		prop.load(reader);
		value = prop.getProperty(Key);
	}catch (Exception e) {
		// TODO: handle exception
	}
		return value;
}
	//select value from an input field using the given value
	public static void getList(String givenValue, WebElement ele) {
		Select listValue = new Select(ele);
		 listValue.selectByValue(givenValue);
	}
}
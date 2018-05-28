package com.automationpractise.myStore.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.automationpractise.myStore.excelReader.ExcelReader;
import com.automationpractise.myStore.utilities.GenericMethods;

public class TestBase {
	
	public WebDriver driver;
	Browser browser;
	ExcelReader excel;
	
@BeforeSuite
	public void init() {
		getBrowser();
		getURL();
	}

	public void getBrowser() {
		browser = new Browser();
		//read the browser name from the Properties file
		//change to excel reading later
		driver = browser.getBrowser(GenericMethods.getValue("Browser"));
	}

	public void getURL() {
		driver.get(GenericMethods.getValue("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
/*@AfterSuite
	public void close() {
		driver.quit();
	}*/
	
	//calling getdata method from ExcelReader class and storing the data in a String variable
	public String[][] getExcelData(String excelName, String sheetName){
		String path = "C:\\Users\\krishnaraj\\Desktop\\GitProjects\\myStore\\src\\main\\java\\com\\automationpractise\\myStore\\data\\TestData.xlsx";
				//System.getProperty("user.dir")+" /src/main/java/com/automationpractise/myStore/data/" + excelName;
		excel = new ExcelReader(path);
		String data[][] = excel.getdata(excelName, sheetName);
		return data;
		
	}

}

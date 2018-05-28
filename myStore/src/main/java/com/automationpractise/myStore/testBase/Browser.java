package com.automationpractise.myStore.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser extends TestBase {
	
	
	
	public WebDriver getBrowser(String browserName) {
		
		try {
		if(browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("IE")|| browserName.equalsIgnoreCase("Internet Explorer")||browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}else {
			System.out.println("Browser not found");
		}
		
		
		
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		return driver;
}
}
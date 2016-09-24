package com.automation.gruyere.AutomationModule.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils {

	private static WebDriverUtils instance = null;
	protected WebDriverUtils(){}
	
	public static WebDriverUtils getInstance(){
		if(null == instance){
			instance = new WebDriverUtils();
		}
		return instance;
	}
	
	public WebDriver getFirefoxDriver(){
		return new FirefoxDriver();
	}
	
	public WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver", Thread.currentThread().getContextClassLoader().getResource("chromedriver.exe").getPath());
		return new ChromeDriver();
	}
	
}

package com.automation.gruyere.AutomationModule.webdriver;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automation.gruyere.AutomationModule.Exception.AutomationFrameworkException;

public class SeleniumWebTest {
	
	protected final static Logger logger = LoggerFactory.getLogger(SeleniumWebTest.class);

	protected WebDriver driver;
	protected static String url = "https://google-gruyere.appspot.com/476213268807/";

	@BeforeMethod(alwaysRun = true)
	public void beforeTest() throws AutomationFrameworkException {
		startDriver();
	}

	@AfterMethod(alwaysRun = true)
	public void afterTest() throws AutomationFrameworkException {
		stopDriver();
		logger.info("#TEST-COMPLETED#");
	}

	protected String getURL() {
		return url;
	}

	protected void startDriver() throws AutomationFrameworkException{
		driver = WebDriverUtils.getInstance().getChromeDriver();
	}

	protected void stopDriver() throws AutomationFrameworkException{
		if(null != driver){
			driver.quit();
		}
	}

}

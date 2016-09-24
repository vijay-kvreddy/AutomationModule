package com.automation.gruyere.AutomationModule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.gruyere.AutomationModule.pages.HomePage;
import com.automation.gruyere.AutomationModule.pages.SignPage;
import com.automation.gruyere.AutomationModule.pages.UserHomePage;
import com.automation.gruyere.AutomationModule.utils.UserUtils;
import com.automation.gruyere.AutomationModule.webdriver.SeleniumWebTest;

public class SigninTests extends SeleniumWebTest{

	protected final static Logger logger = LoggerFactory.getLogger(SigninTests.class);
	
	@Test
	public void signinTest() throws Exception{
		HomePage.load(driver, getURL());
		HomePage.clickOnLogin(driver);
		
		SignPage.enterUsername(driver, UserUtils.getExistingUsers().get(0));
		SignPage.enterPassword(driver, "password");
		SignPage.submit(driver);
		
		Assert.assertTrue(UserHomePage.validateSignOutElement(driver), "Invalid Username/Password.");
	}
	
	
	@Test
	public void signinTestNegative() throws Exception{
		HomePage.load(driver, getURL());
		HomePage.clickOnLogin(driver);
		
		SignPage.enterUsername(driver, UserUtils.getExistingUsers().get(0));
		SignPage.enterPassword(driver, "password1");
		SignPage.submit(driver);
		
		Assert.assertFalse(UserHomePage.validateSignOutElement(driver), "User logged in with invalid credentials.");
	}
}

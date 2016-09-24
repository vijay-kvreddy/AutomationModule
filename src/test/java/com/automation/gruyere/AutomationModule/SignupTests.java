package com.automation.gruyere.AutomationModule;

import java.util.UUID;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.gruyere.AutomationModule.pages.HomePage;
import com.automation.gruyere.AutomationModule.pages.SignPage;
import com.automation.gruyere.AutomationModule.utils.UserUtils;
import com.automation.gruyere.AutomationModule.webdriver.SeleniumWebTest;

public class SignupTests extends SeleniumWebTest{

	protected final static Logger logger = LoggerFactory.getLogger(SignupTests.class);
	
	@Test
	public void signupTest() throws Exception{
		HomePage.load(driver, getURL());
		HomePage.clickOnNewAccount(driver);
		
		String user = UUID.randomUUID().toString();
		SignPage.enterUsername(driver, user);
		SignPage.enterPassword(driver, "password");
		SignPage.submit(driver);
		
		String status = driver.findElement(By.xpath("//div[contains(@class,'message')]")).getText();
		Assert.assertEquals(status, "Account created.");
		logger.info("Account Created Successfully for Account: " + user);
	}
	
	
	@Test
	public void signupTestNegative() throws Exception{
		HomePage.load(driver, getURL());
		HomePage.clickOnNewAccount(driver);
		
		SignPage.enterUsername(driver, UserUtils.getExistingUsers().get(0));
		SignPage.enterPassword(driver, "password");
		SignPage.submit(driver);
		
		String status = driver.findElement(By.xpath("//div[contains(@class,'message')]")).getText();
		Assert.assertEquals(status, "User already exists.");
	}
}

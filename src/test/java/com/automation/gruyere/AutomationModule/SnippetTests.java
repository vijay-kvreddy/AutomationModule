package com.automation.gruyere.AutomationModule;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.gruyere.AutomationModule.pages.HomePage;
import com.automation.gruyere.AutomationModule.pages.MySnippetsPage;
import com.automation.gruyere.AutomationModule.pages.NewSnippetPage;
import com.automation.gruyere.AutomationModule.pages.SignPage;
import com.automation.gruyere.AutomationModule.pages.UserHomePage;
import com.automation.gruyere.AutomationModule.utils.UserUtils;
import com.automation.gruyere.AutomationModule.webdriver.SeleniumWebTest;

public class SnippetTests extends SeleniumWebTest{
	
	protected final static Logger logger = LoggerFactory.getLogger(SnippetTests.class);

	@Test
	public void createSnippetTest() throws Exception{
		HomePage.load(driver, getURL());
		HomePage.clickOnLogin(driver);
		
		SignPage.enterUsername(driver, UserUtils.getExistingUsers().get(0));
		SignPage.enterPassword(driver, "password");
		SignPage.submit(driver);
		
		UserHomePage.clickOnNewSnippetLink(driver);
		
		String newSnippet = "New Snippet - " + UUID.randomUUID().toString();
		
		NewSnippetPage.enterNewSnippet(driver, newSnippet);
		NewSnippetPage.clickOnSubmit(driver);
		
		List<String> mySnippets = MySnippetsPage.getMySnippets(driver);
		
		Assert.assertTrue((null != mySnippets && !mySnippets.isEmpty()), "No Snippets Found, new snippet not added.");
		Assert.assertTrue(mySnippets.contains(newSnippet), "New snippet not added.");
		
	}
}

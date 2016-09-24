package com.automation.gruyere.AutomationModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewSnippetPage {

	public static void enterNewSnippet(WebDriver driver, String snippet) throws Exception{
		driver.findElement(By.xpath("//textarea[contains(@name,'snippet')]")).sendKeys(snippet);
	}
	
	public static void clickOnSubmit(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(3000);
	}
}

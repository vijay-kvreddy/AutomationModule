package com.automation.gruyere.AutomationModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void load(WebDriver driver, String url) throws Exception{
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public static void clickOnNewAccount(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//a[contains(@href,'newaccount')]")).click();
		Thread.sleep(3000);
	}
	
	public static void clickOnLogin(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		Thread.sleep(3000);
	}
}

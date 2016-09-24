package com.automation.gruyere.AutomationModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage {

	public static void enterUsername(WebDriver driver, String username) throws Exception{
		driver.findElement(By.xpath("//input[contains(@name,'uid')]")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	public static String getUsername(WebDriver driver) throws Exception{
		return driver.findElement(By.xpath("//input[contains(@name,'uid')]")).getText();
	}
	
	public static void enterPassword(WebDriver driver, String password) throws Exception{
		driver.findElement(By.xpath("//input[contains(@name,'pw')]")).sendKeys(password);
		Thread.sleep(1000);
	}
	
	public static void submit(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
	}
	
}

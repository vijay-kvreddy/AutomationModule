package com.automation.gruyere.AutomationModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class UserHomePage {

	public static void load(WebDriver driver, String url) throws Exception{
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public static boolean validateSignOutElement(WebDriver driver) throws Exception{
		try{
			if(null != driver.findElement(By.xpath("//a[contains(@href,'logout')]")) && driver.findElement(By.xpath("//a[contains(@href,'logout')]")).isDisplayed()){
				return true;
			}else{
				return false;
			}
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	public static void clickOnNewSnippetLink(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//a[contains(@href,'newsnippet')]")).click();
		Thread.sleep(3000);
	}
}

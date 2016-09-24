package com.automation.gruyere.AutomationModule.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySnippetsPage {

	public static List<String> getMySnippets(WebDriver driver) throws Exception{
		List<String> mySnippets = new ArrayList<String>();
		List<WebElement> webElements = driver.findElements(By.xpath("//div[contains(@class,'content')]/table//tr/td/div"));
		if(null != webElements && !webElements.isEmpty()){
			for (WebElement webElement : webElements) {
				mySnippets.add(webElement.getText());
			}
		}
		return mySnippets;
	}
}

package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		WebElement searchBox = driver.findElement(By.id("target"));
		wait(2);
//		sendText(searchBox,"NeoTech");
//		wait(2);
		
		
		searchBox.sendKeys(Keys.ESCAPE);
		wait(1);
		searchBox.sendKeys(Keys.TAB);
		wait(1);
		searchBox.sendKeys(Keys.ENTER);
		wait(1);
		
	
		sendText(searchBox,"Selenium");
		wait(2);
		
		
		
		tearDown();
		

	}

}
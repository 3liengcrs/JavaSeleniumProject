package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		
		Actions action = new Actions(driver);
		WebElement el = driver.findElement(By.linkText("My eBay"));
		action.moveToElement(el).perform();
		wait(5);
		
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();
		wait(51);
		
		
		tearDown();

	}

}

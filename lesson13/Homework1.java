package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {

	/*
	 	Open chrome browser
		Go to https://demo.guru99.com/test/drag_drop.html
		Drag the following blocks in different ways
		Drag BANK to DEBIT SIDE
		Drag SALES to CREDIT SIDE
		Drag 5000 to DEBIT SIDE
		Drag 5000 to CREDIT SIDE
		Close the browser
	 
	 */
		
		setUp();
		
		//Locate (Bank) to be dragged
		WebElement from1 = driver.findElement(By.id("credit2"));
		
		//Locate Debit Side
		WebElement to1 = driver.findElement(By.id("bank"));
		
		//Locate Sales to be dragged
		WebElement from2 = driver.findElement(By.id("credit1"));
		
		//Locate Credit Side
		WebElement to2 = driver.findElement(By.id("loan"));
		
		//Locate 5000
		WebElement from3 = driver.findElement(By.id("fourth"));
		
		//Locate the Debit Side
		WebElement to3 = driver.findElement(By.id("amt7"));
		
		//Locate the Credit Side
		WebElement to4 = driver.findElement(By.id("amt8"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(from1, to1).perform();
		
		wait(2);
		
		action.dragAndDrop(from2, to2).perform();
		
		wait(2);
		
		action.dragAndDrop(from3, to3).perform();
		
		wait(2);
		
	//	action.dragAndDrop(from3, to4).perform();
		action.clickAndHold(from3).moveToElement(to4).release().perform();
		
		
		//verify that Perfect! is displayed
		
		if (driver.findElement(By.linkText("Perfect!")).isDisplayed())
		{
			System.out.println("Perfect! --- is displayed!");
		}
		else
		{
			System.out.println("Perfect! --- is NOT displayed!");
		}
		

		tearDown();
	}

}
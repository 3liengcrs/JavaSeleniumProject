package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		
		
		
		
		String usernameBox = ConfigsReader.getProperty("username");
		String passwordBox = "";
		
		driver.findElement(By.id("txtUsername")).sendKeys(usernameBox);
		driver.findElement(By.id("txtPassword")).sendKeys(passwordBox);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		Thread.sleep(3000);
		WebElement errorMsg =  driver.findElement(By.id("txtPassword-error"));
		
		
		if(errorMsg.isDisplayed()) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test failed!");
		}
		
		tearDown();

	}

}

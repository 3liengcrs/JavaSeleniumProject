package com.neotech.lesson12;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {
		// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
		// https://accounts.google.com/signup

		
		setUp();
		
		System.out.println("Title --> " + driver.getTitle());
		
		System.out.println("Window Handle --> " + driver.getWindowHandle());
		
		wait(2);
		
		// this method not only clicks the web element but also
		// makes sure that the element is click-able
		click(driver.findElement(By.linkText("Help")));
		
		wait(2);
		
		switchToChildWindow();
		
		wait(2);
		
		String title2 = driver.getTitle();
		
		System.out.println("Title of the child window --> " + title2);
		
		tearDown();
	}

}
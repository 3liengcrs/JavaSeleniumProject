package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {
		// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		//https://jqueryui.com/tooltip/
		
		setUp();
		
		//1. switch to frame by index
		switchToFrame(0);
		
		WebElement age = driver.findElement(By.id("age"));
		sendText(age, "33");
		wait(2);
		
		//we need to switch to the default page
		driver.switchTo().defaultContent();
		
		//3. switch to frame by WebElement
		switchToFrame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		sendText(age, "25");
		
		wait(3);
		
		
		//switch back to the main content
		driver.switchTo().defaultContent();
		
		tearDown();
		
	}

}
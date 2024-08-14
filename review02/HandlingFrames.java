package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.findElement(By.id("age")).sendKeys("20");
		
		Thread.sleep(2000);
		
		
		
		
		tearDown();

	}

}

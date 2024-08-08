package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass{
	// Go to https://demoqa.com/automation-practice-form
		// Check Female
		// Select all the Hobbie

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		
		
		
		
		Thread.sleep(2000);
		
		
		
		tearDown();
		

	}

}

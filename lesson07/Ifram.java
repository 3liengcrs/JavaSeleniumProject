package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import com.neotech.utils.BaseClass;

public class Ifram  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		setUp();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("age")).sendKeys("45");
		Thread.sleep(2500);
		driver.switchTo().defaultContent();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(2300);
		
		tearDown();

	}

}

package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		Thread.sleep(2000);
		WebElement buttonStart = driver.findElement(By.id("btnClick"));
		
		buttonStart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 WebElement button = driver.findElement(By.id("button1"));
		button.click();
//		Thread.sleep(2000);
//		WebElement buttonStart = driver.findElement(By.id("btnClick"));
		
		buttonStart.click();
		
		Thread.sleep(2000);
		
		
		
		tearDown();

	}

}

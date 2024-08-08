package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		driver.findElement(By.name("cusid")).sendKeys("1545as");
		driver.findElement(By.name("submit")).click();
		
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1500);
		simpleAlert.dismiss();
		Thread.sleep(1500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1500);
		
		
		Alert firstAlert = driver.switchTo().alert();
		Thread.sleep(1500);
		firstAlert.accept();
		Thread.sleep(1500);
		
		
		
		Alert secondAlert = driver.switchTo().alert();
		Thread.sleep(1500);
		secondAlert.accept();
		Thread.sleep(1500);
		
		
		
		Thread.sleep(1500);
		
		tearDown();

	}

}

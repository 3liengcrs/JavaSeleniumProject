package com.neotech.lesson14;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		wait(3);
		String filePath = System.getProperty("user.dir")+"/screenshots/FacebookLogin.png";
		
		sendText(driver.findElement(By.id("myFile")), filePath);
		wait(1);
		driver.findElement(By.id("submit-button")).click();
		wait(1);
		acceptAlert();
		wait(3);
		tearDown();

	}

}

package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		String filePath = System.getProperty("user.dir")+"/screenshots/FacebookLogin.png";
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
		wait(3);
		
		
		tearDown();

	}

}

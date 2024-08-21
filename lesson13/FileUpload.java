package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		driver.findElement(By.linkText("File Upload")).click();
		String filePath = System.getProperty("user.dir")+"/screenshots/FacebookLogin.png";
		wait(4);
		sendText(driver.findElement(By.id("file-upload")), filePath);
		wait(4);
		driver.findElement(By.id("file-submit")).click();
		wait(14);
		
		
		
		
		tearDown();
		

	}

}

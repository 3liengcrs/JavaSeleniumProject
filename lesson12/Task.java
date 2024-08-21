package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task extends CommonMethods{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		wait(2);
		sendText(driver.findElement(By.id("txtPassword")), "");
		wait(2);
	     driver.findElement(By.xpath("//button")).click();
	     
		
		wait(3);
		TakesScreenshot ssDriver = (TakesScreenshot) driver;
		
		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE);
		File sceenShotsDir = new File("screenshots/HRM/no_password.png");
		if(!sceenShotsDir.exists()) {
			sceenShotsDir.mkdirs();
		}
		
		
		
		tearDown();

	}

}

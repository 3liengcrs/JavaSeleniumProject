package com.neotech.lesson12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenshotDemo extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait(2);
		
		
		
		TakesScreenshot ssDriver = (TakesScreenshot) driver;
		
		
		File screenShot = ssDriver.getScreenshotAs(OutputType.FILE);
		
		try {
			File screenShotsLocation= new File("screenShots/HRM/dashboard1.png");
			if(!screenShotsLocation.exists()) {
				screenShotsLocation.mkdirs();
			}
			Files.copy(screenShot, screenShotsLocation);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!");
		}

		tearDown();

	}

}

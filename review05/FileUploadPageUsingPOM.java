package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.pages.FileUploadPageElements;
import com.neotech.utils.CommonMethods;

public class FileUploadPageUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		FileUploadPageElements fileUp = new FileUploadPageElements();
		wait(1);
		String path = "C:/Users/3li/Desktop/1.jpg";
		fileUp.fileInput.sendKeys(path);
		wait(2);
		fileUp.upload.click();
		wait(5);
		//waitForVisibility(fileUp.contactDiv);
		
		String expectedText = "File uploaded successfully!";
		
		String actualText = driver.findElement(By.cssSelector("div.ContactUs")).getText();
		wait(3);
		
		String destination = "screenshots";
		
		if(actualText.equals(expectedText)) {
			destination += "/HRM/image1.png";
		}else {
			destination += "/HRM/image.png";
		}
		TakesScreenshot ts = (TakesScreenshot) fileUp.screenshotDiv;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(destination);

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		wait(2);
		tearDown();
		

	}

}

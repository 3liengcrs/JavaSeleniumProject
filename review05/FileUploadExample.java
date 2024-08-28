package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class FileUploadExample extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();   
		
		
		String path = "C:/Users/3li/Desktop/1.jpg";
		WebElement fileInput = driver.findElement(By.id("image_file"));
		wait(2);
		fileInput.sendKeys(path);
		wait(2);
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='image_file']/following-sibling::span"));
		upload.click();
		//waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));
		
		wait(5);
		String expectedText = "File uploaded successfully!";
		String actualText = driver.findElement(By.cssSelector("div.ContactUs")).getText();
		wait(3);
		String destination = "screenshots";
		if(actualText.equals(expectedText)) {
			destination += "/HRM/image.png";
		}else {
			destination += "/failed/image.png";
		}
		TakesScreenshot ts = (TakesScreenshot) driver.findElement(By.className("content"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(destination);

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		wait(3);
		
		
		
		
		
		tearDown();

	}

}

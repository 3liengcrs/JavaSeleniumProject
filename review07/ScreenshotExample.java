package com.neotech.review07;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		wait(1);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desstination = new File("screenshots/FacebookLogin.png");
		
		try {
			Files.copy(source, desstination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}
		System.out.println("--------------------------------");

		// Taking the screenshot of a WebElement (form)
		WebElement form = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));

		TakesScreenshot ts2 = (TakesScreenshot) form;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("screenshots/Form.png");
		
		try {
			Files.copy(source2, destination2);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}
		
		wait(1);
		tearDown();
		

	}

}

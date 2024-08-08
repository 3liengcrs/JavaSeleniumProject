package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redfin.com/");
		String expectedUrl = driver.getCurrentUrl();
		String theUrl = "https://www.redfin.com/";
		  if(expectedUrl.equals(theUrl)) {
			  System.out.println("The test passed");
		  }else {
			  System.out.println("Test Field!");
			  System.out.println("The URL : "+ theUrl);
			  System.out.println("The expected URL : "+ expectedUrl);
		  }
		Thread.sleep(5000);
		driver.quit();
		

	}

}

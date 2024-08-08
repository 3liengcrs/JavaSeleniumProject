package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		// 1st way go to url: use .get();
		driver.navigate().to("https://www.zillow.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		String  url = "https://www.zillow.com/";
		String currentUrl = driver.getCurrentUrl();
		
		driver.manage().window().fullscreen();
		Thread.sleep(10000);
		driver.quit();

	}

}

package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class OpenOrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ConfigsReader.readProperties(Constants.CONFIGURATION_FIILEPATH);
		String browser = ConfigsReader.getProperty("browser");
		
		WebDriver driver = null;
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
		
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2500);
		driver.quit();
		
		

	}

}

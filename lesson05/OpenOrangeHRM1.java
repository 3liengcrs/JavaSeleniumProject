package com.neotech.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {
	public static final String url = "hrrps://hrm.neotechacademy.com";

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop);
		
//		WebDriver driver = new ChromeDriver(); 
		
		WebDriver driver = null; 
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(driver != null) {
			String url = prop.getProperty("url");
			driver.get(url);
			
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2500);
			driver.quit();
		}else {
			System.out.println("unsupperted driver!!!");
		}
		
		
		
//		String url = prop.getProperty("url");
//		driver.get(url);
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
		
		
		
		
		 

	}

}

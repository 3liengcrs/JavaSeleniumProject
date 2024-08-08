package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.neotechacademy.com/");
		String title = driver.getTitle();
		System.out.println("Title ->>>"+title);
		Thread.sleep(1000);
		driver.quit();
		

	}

}

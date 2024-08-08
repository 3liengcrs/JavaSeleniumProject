package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Go to facebook page
		// fill out the user name 
		// fill out the password
		// click on login
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");  
		
		WebElement userNameBox = driver.findElement(By.id("email"));
		 
		Thread.sleep(2000);
		userNameBox.sendKeys("neo@gmail.com");
		 
		driver.findElement(By.id("pass")).sendKeys("password");
		
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		

	}

}

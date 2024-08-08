package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSselector {
	public static final String url = "https://sis.neotechacademy.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#tPassword")).sendKeys("Neotech$123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		Thread.sleep(2000);
		

	}

}

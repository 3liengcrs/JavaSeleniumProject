package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
	public static final  String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Create new account")).click();
		
		// fill the form
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.name("lastname")).sendKeys("Wick"); 
		
		driver.findElement(By.name("reg_email__")).sendKeys("john@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("john@gmail.com");
		driver.findElement(By.name("password_step_input")).sendKeys("he554ddW2@");
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		Thread.sleep(3000);

	}

}

package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		setUp();
		// focus on testing process
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		
		System.out.println(username + " " + password);
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
		
		Thread.sleep(3000);
		
		String expected = "Jacqueline White";
		String actuel = driver.findElement(By.id("account-name")).getText();
		
		if(expected.equals(actuel)) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test failed!!!");
		}
		
		
		
		
		tearDown();

	}

}

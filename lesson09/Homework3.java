package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//	    Open chrome browser
//        Go to "https://hrm.neotechacademy.com/"
//        Login into the application
//        Click on PIM > Add Employee 
//        Add Employee
//        Log out 
//        Quit the browser
		setUp();
		String username = ConfigsReader.getProperty("username");
		String password = ConfigsReader.getProperty("password");
		
		System.out.println(username + " " + password);
		
		WebElement usernameBox = driver.findElement(By.id("txtUsername"));
		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		loginButton.click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		WebDriverWait firstWait = new WebDriverWait(driver, Duration.ofSeconds(45) );
		firstWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		driver.findElement(By.id("first-name-box")).sendKeys("John");
		driver.findElement(By.id("last-name-box")).sendKeys("Doe");
		WebElement location = driver.findElement(By.id("location"));
		Select locationDD = new Select(location);
		locationDD.selectByVisibleText("France Regional HQ");

		Thread.sleep(1000);
		driver.findElement(By.id("modal-save-button")).click();

		WebDriverWait personalDetailsWait = new WebDriverWait(driver, Duration.ofSeconds(45));
		personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));

		// log out
		driver.findElement(By.id("account-job")).click();
		driver.findElement(By.id("logoutLink")).click();

		
		Thread.sleep(15000);
		
		
		
		tearDown();
		

	}

}

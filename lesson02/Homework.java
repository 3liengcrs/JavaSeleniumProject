package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Test Case
//		Open chrome browser
//		Go to "https://demo.guru99.com/test/newtours/"
//		Click on Register Link
//
//		Fill out just
//		First Name:	
//		Last Name:	
//		Phone:	
//		Email:	
//		And Click Submit 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Mark");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Dev");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("200-256-8754");
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("neo@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("street ave city NJ ");
		Thread.sleep(1000);
		WebElement countryDropdown = driver.findElement(By.name("country"));

        // Create a Select object
        Select selectCountry = new Select(countryDropdown);

        // Select a country by visible text
        selectCountry.selectByVisibleText("UNITED STATES");
        Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("neotech");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Her2012@****25");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Her2012@****25");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		 WebElement confirmationMessage = driver.findElement(By.xpath("//font[contains(text(), 'Thank you for registering')]"));

	        // Extract and print the confirmation text
	        String confirmationText = confirmationMessage.getText();
	        System.out.println("Confirmation Message: " + confirmationText);
		
		driver.quit();
		

	}

}

package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Chrome browser and go to Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Enter valid username using CSS Selector
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys("your_username");

        // Enter valid password using XPath
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("your_password");
        

        // Click login using XPath
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();
        Thread.sleep(5000); // Wait for the login to complete

        // Verify user successfully logged in (simplified check)
        if (driver.getCurrentUrl().contains("facebook.com")) {
            System.out.println("User successfully logged in");
        } else {
            System.out.println("Login failed");
        }

        // Close the browser
        driver.quit();

	}

}

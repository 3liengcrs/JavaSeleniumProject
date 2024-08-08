package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

        // Open Chrome browser and go to Facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Enter valid username using CSS selector
        driver.findElement(By.cssSelector("#email")).sendKeys("3liengcrs@gmail.com");
        

        // Enter valid password using CSS selector
        driver.findElement(By.cssSelector("#pass")).sendKeys("Ali0110");
     

        // Click login using CSS selector
        driver.findElement(By.cssSelector("button[name='login']")).click();
       
        Thread.sleep(15000); // Wait for the login to complete

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
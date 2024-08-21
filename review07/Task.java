package com.neotech.review07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the jQuery UI page
            driver.get("https://jqueryui.com/");
            
            // Wait until the Datepicker link is clickable and click it
            wait(10);
            WebElement datepickerLink = driver.findElement(By.linkText("Datepicker"));
            waitForClickability(datepickerLink);
            datepickerLink.click();
            

            // Switch to the iframe that contains the Datepicker
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
            
            // Click to open the calendar
            WebElement dateField = driver.findElement(By.id("datepicker"));
            dateField.click();

            // Select the year 2026 from the calendar
            while (!driver.findElement(By.className("ui-datepicker-year")).getText().equals("2026")) {
                driver.findElement(By.className("ui-datepicker-next")).click();
            }
            
            // Select the month September
            while (!driver.findElement(By.className("ui-datepicker-month")).getText().equals("September")) {
                driver.findElement(By.className("ui-datepicker-next")).click();
            }
            
            // Select the day 25
            driver.findElement(By.xpath("//a[text()='25']")).click();
            
            // Verify the selected date
            String selectedDate = dateField.getAttribute("value");
            if (selectedDate.equals("09/25/2026")) {
                System.out.println("Date selected successfully: " + selectedDate);
            } else {
                System.out.println("Failed to select the correct date. Selected: " + selectedDate);
            }
            
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
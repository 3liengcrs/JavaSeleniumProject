package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Verify element is present
//	    Open chrome browser
//	    Go to "https://the-internet.herokuapp.com/"
//	    Click on the "Dynamic Loading" link
//	    Click on "Example 1..." and click on "Start"
//	    Verify element with text "Hello World!" is displayed
//	    Close the browser 
		setUp();
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.linkText("Dynamic Loading"));
		clk.click();
		
		Thread.sleep(2000);
		WebElement clk2 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
		clk2.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(20000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedCondition)
		boolean element = driver.findElement(By.xpath("//*[text()='Hello World!']")).isDisplayed();
	

        // Verify if the element is displayed
        
         System.out.println("The element with text 'Hello World!' is displayed."+ element);
       
		
		
		tearDown();

	}

}

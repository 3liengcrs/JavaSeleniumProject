package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) {

		
		/*
		 	Go to https://hrm.neotechacademy.com/
			Log in using our custom methods
			Go to PIM menu
			Add an employee
			Go to Employee List
			Get the list of the employees (Using tables - tr and td) 
			Loop to search for the employee you added
			When you find the employee - click on it.
			Take a screenshot
		 */

		setUp();
		
		//login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button")));
		
		//navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		
		//click on Add Employee
		click(driver.findElement(By.linkText("Add Employee")));
		
		//wait for the visibility of first name box
			//we have ExpectedConditions: visibilityOfElement(WebElement), visibilityOfElementLocated(Locator)
		waitForVisibility(By.id("first-name-box"));
		
		//send the employee data
		sendText(driver.findElement(By.id("first-name-box")), "Jane");
		sendText(driver.findElement(By.id("last-name-box")), "Doe");
		
		//get the ID to search for the employee later
		String employeeID = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		//select the location
		selectDropdown(driver.findElement(By.id("location")), "Canadian Development Center");
		
		wait(2);
		
		//now we need to click on save
		click(driver.findElement(By.id("modal-save-button")));
				
		//wait for the employee details 
		
		waitForVisibility(By.id("pimPersonalDetailsForm"));
		
		//click on Employee List
		click(driver.findElement(By.linkText("Employee List")));
		
		
		//get all elements
		//search for the one with the id
		//once you find it click on it and break out of the loop
		
		boolean found = false;
		
		while(!found)
		{
			//wait for a second when I go to a new page
			wait(1);
			
			//get all id's on the current page
			List<WebElement> idList = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]"));
			
			for (WebElement id : idList)
			{
				if (id.getText().equals(employeeID))
				{
					found = true;
					id.click();
					break;
				}
			}
			
			//if we are here and found is still false, it means the id we searched for is not on the first page
				//then go to the next page
			
			if(!found)
			{
				System.out.println("I need to go to the next page!!!");
				click(driver.findElement(By.xpath("//i[text()='chevron_right']")));
			}
			
		}
		
		//wait for one of the elements on the personalDetails form and then take a screenshot
		
		waitForVisibility(By.id("firstName"));
		
		
		
		//take a screenshot
			//get the camera
				TakesScreenshot ts = (TakesScreenshot) driver;
			//press on the button
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			//save it 
				try {
					Files.copy(sourceFile, new File("screenshots/Lesson13/Homework2.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}		
		
		tearDown();
	}

}
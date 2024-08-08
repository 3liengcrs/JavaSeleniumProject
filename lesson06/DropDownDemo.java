package com.neotech.lesson06;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUp();
		 driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		 driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
		 
		 
		 Thread.sleep(2000);
		 // create a webdriver object
		 WebElement yearDDElement = driver.findElement(By.id("dAcademicYear_list"));
		 System.out.println(yearDDElement.getText());
		 
		
		 
		 
		 
		 //create a select object 
		 Select yearDD = new Select(yearDDElement);
		 // select using index
		 yearDD.selectByIndex(5);
		 Thread.sleep(2000);
		// select using value
		 yearDD.selectByValue("10");
		 Thread.sleep(2000);
		// select using visible
		 yearDD.deselectByVisibleText("2016-2017");
		 
		 
		 
		 // lets get the options of the select object
		 
		 yearDD.
		 
		 Thread.sleep(2000);

		
		tearDown();

	}

}

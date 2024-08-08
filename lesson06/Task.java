package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		
		WebElement day = driver.findElement(By.id("day"));
		Select birthDay = new Select(day);
		birthDay.selectByIndex(13);
		Thread.sleep(1500);
		System.out.println("Number of items in month dro");
		
		WebElement month = driver.findElement(By.id("month"));
		Select birthMonth = new Select(month);
		birthMonth.selectByIndex(5);
		Thread.sleep(1500);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select birthYear = new Select(year);
		birthYear.selectByValue("2005");
		Thread.sleep(1500);
		
		
		tearDown();
		
		

	}

}

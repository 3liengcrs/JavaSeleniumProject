package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		
//		Select colorDD = new Select(driver.findElement(By.id("oldSelecMenu")));
		WebElement colorDdElement = driver.findElement(By.id("oldSelecMenu"));
		
		Select colorDD = new Select(colorDdElement);
		
		colorDD.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement modernDD = driver.findElement(By.id(null));
		
		
		
		
		
		
		tearDown();

	}

}

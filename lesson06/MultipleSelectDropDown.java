package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropDown extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		WebElement multiSelectDdElement = driver.findElement(By.id("multi-select"));
		
		Select multiSelectDD = new Select(multiSelectDdElement);
		
		
		boolean isMultiSelect = multiSelectDD.isMultiple();
		
		System.out.println("The drop down is multi select: "+ isMultiSelect);
		
		if(isMultiSelect ) {
			List<WebElement> options = multiSelectDD.getOptions();
			
			for(WebElement opt: options) {
				String text = opt.getText();
				System.out.println("The visible text is "+ text);
				multiSelectDD.selectByVisibleText(text);
				Thread.sleep(2000);
			}
		}
		multiSelectDD.deselectByIndex(0);
		Thread.sleep(2000);
		multiSelectDD.deselectAll();
		
		
		Thread.sleep(2000);
		tearDown();

	}

}

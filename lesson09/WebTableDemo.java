package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		
		Iterator<WebElement> it = headerData.iterator()
;
		while(it.hasNext()) {
			String text = it.next().getText();
			System.out.println(text + " | ");
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']//tr"));
		
		
		List<WebElement> tds = driver.findElements(By.xpath("//table[@id='task-table']//td"));
		
		for(WebElement td:tds) {
			System.out.println(td.getText());
		}
		
		tearDown();
		

	}

}

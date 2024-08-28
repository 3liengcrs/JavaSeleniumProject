package com.neotech.lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class JsExecutorDemo extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUp();
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait(3);
		
		js.executeScript("arguments[0].style.backgroundColor='blue';"
				+ "arguments[1].style.backgroundColor='red'",username, password);
		
		wait(3);
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button")));
		wait(4);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		wait(2);
		driver.findElement(By.linkText("Employee List")).click();
		wait(4);
		js.executeScript("window.scrollBy(0,1500)");
		wait(4);
		//js.executeScript("window.scrollBy(0,-1500)");
		wait(2);
		WebElement homeBtn = driver.findElement(By.id("home-menu-trigger"));
		wait(2);
		js.executeScript("arguments[0].scrollIntoView(true)", homeBtn);
		wait(14);
		
		tearDown();

	}

}

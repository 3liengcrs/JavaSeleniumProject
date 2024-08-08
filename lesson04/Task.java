package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//-----------TC-1-----------
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username and password
//		Click on login button
//		Then verify "Web Orders" is displayed and also username is displayed right top corner
//
//		-----------TC-2-----------
//		Go to "https://www.ebay.com"
//		Get All links on ebay and print the count
//		Iterate all the links and print those that have text
		
		final String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		Thread.sleep(2000);
		WebElement headr = driver.findElement(By.tagName("h1"));
		if(headr.isDisplayed()) {
			System.out.println("The header "+headr.getText() + " Is desplayed");
		}else {
			System.out.println("The header is not displayed");
		}
		
		WebElement loginText = driver.findElement(By.cssSelector("div.login_info"));
		System.out.println(loginText.getText());
		if( loginText.getText().contains("Tester")) {
			System.out.println("Test is success");
			
		}else {
			System.out.println("Test is field");
			
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}

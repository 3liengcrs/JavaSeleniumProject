package com.neotech.review07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class CalenderHandling extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		
		WebElement link = driver.findElement(By.linkText("Datepicker"));
		wait(2);
		link.click();
		switchToFrame(driver.findElement(By.tagName("iframe")));

		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		dateTextBox.click();

		String expectedMonthYear = "September 2026";

		while (true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
			String monthYearText = monthYear.getText();

			if (monthYearText.equals(expectedMonthYear)) {
				break;
			}

			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		wait(1);

		// Now we need to click on the correct date
		String expectedDay = "25";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		// Iterate all the days until I find 25th and then click on it
		for (WebElement day : days) {
			if (day.getText().equals(expectedDay)) {
				// I have found the correct day
				day.click();
				break;
			}
		}
		wait(2);

		// Let's verify that we selected the correct date -> 09/25/2026
		String expectDate = "09/25/2026";

		if (dateTextBox.getAttribute("value").equals(expectDate)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		
		wait(4);
		tearDown();

	}

}

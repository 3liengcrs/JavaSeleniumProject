package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class CalenderDemo  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();   
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//click on the calendar
		driver.findElement(By.xpath("//span[@class='calDepartLabelCont']/span[2]")).click();
		//almost all the time, you can create multiple locators for the same element. 
		//do not overthink it, just create one and try it
		
		
		
		//selecting December 20 as the departing date
		
		//locate the month: 
		String currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		
		
		while(!currentMonth.equals("December"))//loop until we see december instead of August
		{
			//click on the arrow to go to the next month
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		    //get the updated value of the current month
			currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		Thread.sleep(3000);
		
		
		
		
		
		
		tearDown();

	}

}

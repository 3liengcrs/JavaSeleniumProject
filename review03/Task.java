package com.neotech.review03;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		Thread.sleep(2000);
		
		driver.findElement(By.id("windowButton")).click();
		
		 String mainWindowHandle = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
//		java.util.Iterator<String> it =  allWindows.iterator();
//		String handle1 = it.next();
//		String handle2 = it.next();
		
		for (int i = 0; i < 10; i++) {
            for (String handle : allWindowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    Thread.sleep(1000); // Pause for a moment
                    driver.switchTo().window(mainWindowHandle);
                    Thread.sleep(1000); // Pause for a moment
                }
            }
        }

		
		
		
		Thread.sleep(2000);
		tearDown();
		

	}

}

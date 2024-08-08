package com.neotech.lesson01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		int title = driver.getTitle().length();
//		System.out.println("Title ->>>"+title);
//		driver.navigate().to("https://frontendmasters.com/");
//		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl.hashCode());
//		Thread.sleep(1000);
//		driver.findElement(By.name("search")).sendKeys("react");
		WebElement element =driver.findElement(By.id("twotabsearchtextbox"));
        // Interact with the element: send keys to the input field
		element.sendKeys("Iphone");
		element.submit();
//		Thread.sleep(5000)
		
		
		System.out.println(element);
		System.out.println("Page title is: " + driver.getTitle());

		driver.quit();
		

	}

}

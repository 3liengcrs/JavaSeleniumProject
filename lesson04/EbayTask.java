package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method 
//		-----------TC-2-----------
//		Go to "https://www.ebay.com"
//		Get All links on ebay and print the count
//		Iterate all the links and print those that have text
		final String url = "https://www.ebay.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = 0;
		for(WebElement link: allLinks) {
			if(!link.getText().isEmpty()) {
				System.out.print(link.getText());
				System.out.println(" - href "+ link.getAttribute("href"));
				count++;
			}
		}
		System.out.println(" The Total number of all a tags is :"+ allLinks.size());
		System.out.println("The total number of all a tags with text is "+ count);

	}

}

package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String  title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(driver.getTitle().equals(title)) {
			System.out.println("You are in the right page"+ driver.getTitle());
		} else {
			System.out.println("You are in the wrong page");
		}

	}

}

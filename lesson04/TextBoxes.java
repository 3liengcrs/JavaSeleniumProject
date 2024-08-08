package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#RESULT_TextField-1")).sendKeys("Justin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Emrah");
		
		driver.findElement(By.cssSelector("#RESULT_TextField-2")).sendKeys("Mike");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Devid");
		WebElement titel = driver.findElement(By.xpath("//*[@id=\'q19\']/div/h1"));
		String textTitle = titel.getText();
		System.out.println(textTitle);
		

	}

}

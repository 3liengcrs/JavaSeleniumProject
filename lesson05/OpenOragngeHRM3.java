package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OpenOragngeHRM3 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUp();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		tearDown();

	}

}

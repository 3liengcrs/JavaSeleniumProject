package com.neotech.test;

import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
	
		LoginPage login = new LoginPage();
		wait(3);
		sendText(login.username,ConfigsReader.getProperty("username") );
		sendText(login.password,ConfigsReader.getProperty("password") );
		wait(2);
		login.loginBtn.click();
		wait(5);
		
		
		tearDown();

	}

}

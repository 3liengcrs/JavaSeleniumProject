package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;

public class FileUploadPageElements  extends BaseClass{
	
	
	
	@FindBy (id="image_file")
	public WebElement fileInput;
	@FindBy(xpath="//input[@id='image_file']/following-sibling::span")
	public WebElement upload;
	
	@FindBy(css="div.ContactUs")
	public WebElement contactDiv;
	
	@FindBy(className = "content")
	public WebElement screenshotDiv;

	
	public FileUploadPageElements() {
		PageFactory.initElements(driver, this);
	}

}

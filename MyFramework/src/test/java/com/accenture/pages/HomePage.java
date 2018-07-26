package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
WebDriver driver;
	@FindBy(linkText= "Register")
	WebElement LinkRegister;
	
	public void Register()
	{
		LinkRegister.click();
	}
	
}


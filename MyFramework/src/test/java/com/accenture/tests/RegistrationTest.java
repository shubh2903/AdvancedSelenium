package com.accenture.tests;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registration;
import com.accenture.utilities.ExcelUtility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class RegistrationTest extends HomePage{
	WebDriver driver;
	HomePage h;  // Creating an object for HomePage Class
	Registration r;
	ExcelUtility e;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\MyFramework\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		h = PageFactory.initElements(driver, HomePage.class);
		r= PageFactory.initElements(driver,Registration.class );
		e= new ExcelUtility();
	} 
	@Test
	public  void TestRegistration() throws IOException {
		h.Register();
		e.getTestData();

	}
	@AfterTest
	public void afterTest() 
	{

	}

}

package com.accenture.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.apache.http.cookie.SetCookie;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo_Cookies {
	WebDriver driver;
  @Test
  public void cookies() {
	  
	  driver.manage().deleteAllCookies();
	  Cookie c = new Cookie("Test","Mycookies");
	  driver.manage().addCookie(c);
	  Set<Cookie> myset = driver.manage().getCookies();
	  for(Cookie s:myset)
	  {
		  System.out.println(s.getName());
		  System.out.println(s.getPath());
		  System.out.println(s.getDomain());
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\MyFramework\\src\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/register");
  }

  @AfterTest
  public void afterTest() {
  }

}

package com.emaimail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class EmailTest {
	
	WebDriver wd;
  @Test
  public void f() {
	  
	  System.out.println("URL opened");
	  System.out.println(wd.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
	  
	  wd = new FirefoxDriver();
	  wd.get("https://www.google.com/");
  }

}

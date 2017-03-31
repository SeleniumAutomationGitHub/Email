package com.emaimail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class EmailTest {
	
	WebDriver driver;
	WebDriverWait wdw;
		
  @Test (description="AutoCompletFromSearchField", priority=1)
  public void verifyAutoCompleteText() throws Exception{
	  wdw = new WebDriverWait(driver, 60);
	  driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("test");
	  WebElement allTxts = driver.findElement(By.xpath("//*[@class='sbdd_b']//ul[@class='sbsb_b']"));
	  			//Identifying all the search result elements by this only one locator
	  wdw.until(ExpectedConditions.visibilityOf(allTxts));
	  //List<WebElement> allTxt = allTxts.findElements(By.tagName("li"));
	  List<WebElement> allTxt = allTxts.findElements(By.tagName("li"));
	  			//Identify each search result locator by this tagName from above locator
	  for(WebElement eachElement : allTxt){
		  System.out.println(eachElement.getText());
		  if(eachElement.getText().equalsIgnoreCase("test ranking")){
			  eachElement.click();
			  break;
		  }
	} 
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
  }

}

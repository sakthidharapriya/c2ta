package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
	  }
	 
	@Test
	  public void Testcase1() {
		driver.findElement(By.id("email")).sendKeys("sakthi");
		driver.findElement(By.id("pass")).sendKeys("123456"); 	 
	 
	}



@AfterMethod
public void afterMethod() {
	driver.close();
	
}
}
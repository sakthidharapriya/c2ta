package com.Testng;

import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class WrapperCallTestng {
	WrapperMethodTestng wm = new WrapperMethodTestng();
	 @BeforeMethod
	  public void beforeMethod() {
		 
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
			
	  }
  	
	@Test
  public void f() throws IOException{
	  wm.enterbyid("txtUsername", "Admin");
	  wm.enterbyid("txtPassword", "admin123");
	  wm.clickbyxpath("//*[@id=\'btnLogin\']");
	  wm.takesnap("src/test/resources/Screenshot/orangehrm.png");
  }
	
 
 
	  @AfterMethod
  public void afterMethod()  {
	 
	  wm.closeapp();

  }

}

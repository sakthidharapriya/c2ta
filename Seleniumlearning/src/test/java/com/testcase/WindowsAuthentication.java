package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsAuthentication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();       
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// admin is username and admin is password
	}

}

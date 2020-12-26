package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ielogin {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");		


	}

}

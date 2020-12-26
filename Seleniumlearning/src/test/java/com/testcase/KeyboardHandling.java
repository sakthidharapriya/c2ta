package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("r.sakthidharapriya");
		Actions action=new Actions(driver);	
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("Wind5909").perform();
		action.sendKeys(Keys.ENTER).perform();

	}

}

package com.testcase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://filebin.net/");
		driver.manage().window().maximize();
		String filename = "//C:\\\\Users\\\\PRIYAPREM\\\\Desktop\\\\fileupload.txt";
		File fileupload = new File(filename);
		String path = fileupload.getAbsolutePath();
		driver.findElement(By.id("fileField")).sendKeys(path);
		}
	}
		
		
		
	


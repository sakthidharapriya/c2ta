package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("email")).sendKeys("sakthi");
		driver.findElement(By.id("pass")).sendKeys("123456");
		//relative
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//absolute
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		//link text
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//partial link text
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		//xpath direct
		//driver.findElement(By.xpath("//*[@name='login']")).click();
//xpath with AND condition
		//driver.findElement(By.xpath("//*[@name='login' and @id='u_0_b']")).click();
		//xpath with OR 
		driver.findElement(By.xpath("//*[@name='login' or @id='u_0_b']")).click();
	}

}

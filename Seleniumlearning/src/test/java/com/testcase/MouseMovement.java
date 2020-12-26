package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers"); 
		WebElement job = driver.findElement(By.xpath("//*[@id='menu_admin_Job']"));
		WebElement jc = driver.findElement(By.xpath("//*[@id='menu_admin_jobCategory']"));
	Actions action=new Actions(driver);	
	action.moveToElement(job).perform();
	action.moveToElement(jc).click().perform();
		
	}

}

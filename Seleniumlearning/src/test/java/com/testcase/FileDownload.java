package com.testcase;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		WebElement textbox= driver.findElement(By.id("textbox"));
		textbox.sendKeys("Hard Work Never Fails");
		WebElement GenerateFile= driver.findElement(By.id("create"));
		GenerateFile.click();
		WebElement download= driver.findElement(By.id("link-to-download"));
		download.click();
		Thread.sleep(3000);
		String file= "//C:\\\\Users\\\\PRIYAPREM\\\\downloads";
		File filelocation = new File(file);
		File[] allfiles= filelocation.listFiles();
		for (File file2 : allfiles) {
			
			if (file2.getName().equals("easyinfo.txt")) {
				System.out.println("File is present");
			
				
				break;
			}
			
		}
		
	}

}
package com.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_Item_Dropdown {
       public static void main(String[] args) {
             
              //Define the Webdriver for Browser i.e. Firefox
              WebDriver driver = new FirefoxDriver();
               
              //Open the URL (Website)
        driver.get("http://housejoy.in/");
       
        //Assign and Select the dropdown list element
        Select selectDropdown = new Select(driver.findElement(By.id("cityName")));
       
        //Get all the option from dropdown list and assign into List
        List<WebElement> listOptionDropdown = selectDropdown.getOptions();
       
        // Count the item dropdown list and assign into integer variable
        int dropdownCount = listOptionDropdown.size();
       
        //Print the total count of dropdown list using integer variable
        System.out.println("Total Number of item count in dropdown list = "  + dropdownCount);      
       
       }
}

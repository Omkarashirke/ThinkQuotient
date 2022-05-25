package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		//Pass URL
//		dr.get("https://www.flipkart.com");  //Opening flipkart web site
		
		dr.get("https://online.actitime.com/thinkquotient/login.do");	//Opening actitime web site
		
		//Identify user name
		WebElement wb = dr.findElement(By.id("username"));
		//Pass username value
		wb.sendKeys("omkars595@gmail.com");
		
		//Identify Password field
		WebElement wb1 = dr.findElement(By.name("pwd"));
		//Pass Password
		wb1.sendKeys("Omkars@28");
		
		//For login
		dr.findElement(By.id("loginButton")).click();
		
		
	}

}

package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement4 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://online.actitime.com/thinkquotient/login.do");	//Opening actitime web site
		
		WebElement wb = dr.findElement(By.id("username"));
		//Pass username value
		wb.sendKeys("omkars595@gmail.com");
		
		String val = wb.getAttribute("value");
		System.out.println(val);

	}

}

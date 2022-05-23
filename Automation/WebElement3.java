package com.SeleniumWebDriver;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3 {

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
		Boolean status = dr.findElement(By.id("loginButton")).isEnabled();
		if(status)
		{
			dr.findElement(By.id("loginButton")).click();
		}
		System.out.println(status);
		
		String tag = dr.findElement(By.id("loginButton")).getTagName();
		System.out.println(tag);
		
		org.openqa.selenium.Point location = dr.findElement(By.id("loginButton")).getLocation();
		System.out.println(location);
		
		String color = dr.findElement(By.id("loginButton")).getCssValue("color");
//		String fontSize = dr.findElement(By.id("loginButton")).getCssValue("font-size");
		System.out.println(color);
		
		String fontSize = dr.findElement(By.id("loginButton")).getCssValue("font-size");
		System.out.println(fontSize);
		
		String fontWeight = dr.findElement(By.id("loginButton")).getCssValue("font-weight");
		System.out.println(fontWeight);
		
		dr.close();
		

	}

}

package com.SeleniumWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver3 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.navigate().to("https://www.flipkart.com/");
		String pageSource = dr.getPageSource();
		System.out.println(pageSource);
		
		//Maximize the window
		dr.manage().window().maximize();
		
		dr.close();
		
//		String WindowHandle = dr.getWindowHandle();
		
	}

}

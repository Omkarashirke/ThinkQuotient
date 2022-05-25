package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://online.actitime.com/thinkquotient/login.do");	//Opening actitime web site
		dr.manage().window().maximize();
		WebElement wb = dr.findElement(By.id("username"));
		wb.sendKeys("omkars595@gmail.com");
		Thread.sleep(4000);
		//Clear Method
		wb.clear();
		
		String text = dr.findElement(By.id("keepLoggedInLabel")).getText(); 
		System.out.println(text);
		
		String forgatePassword = dr.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(forgatePassword);
		
		

	}

}

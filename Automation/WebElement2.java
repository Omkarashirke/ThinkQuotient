package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://online.actitime.com/thinkquotient/login.do");	//Opening actitime web site
		dr.manage().window().maximize();
		
		Boolean display = dr.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed();
		System.out.println(display);
		
		WebElement wb = dr.findElement(By.id("keepLoggedInLabel"));
		wb.click();
		Thread.sleep(3000);
		Boolean status1 = wb.isSelected();
		System.out.println(status1);
		
		wb.click();
		Boolean status2 = wb.isSelected();
		System.out.println(status2);
		
		dr.close();

	}

}

package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvertisementPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		try
		{
			dr.findElement(By.xpath("//botton[@class='_2KpZ6l _2doB4z']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Pop up is not Show....");
		}

	}

}

package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		dr.findElement(By.id("fromCity")).click();
		dr.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Delhi");
		dr.findElement(By.xpath("//p[contains(text(),'New Delhi, India')]")).click();
		
		dr.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
		Thread.sleep(3000);
		

//		dr.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		dr.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		dr.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		dr.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		Thread.sleep(3000);
//		
//		dr.findElement(By.xpath("//div[div[text()='October 2022']]/following-sibling::div[@class='DayPicker-Body']/div/div/div/p[text()='15']")).click();

		while(true)
		try
		{
			dr.findElement(By.xpath("//div[div[text()='October 2022']]/following-sibling::div[@class='DayPicker-Body']/div/div/div/p[text()='15']")).click();
			break;
		}
		catch(Exception e)
		{
			dr.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		
	}

}

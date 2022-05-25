package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.flipkart.com/");
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act = new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//div[text()='Electronics']"))).build().perform();
		dr.findElement(By.xpath("//*[text()='Gaming']")).click();
		dr.findElement(By.xpath("Games")).click();

	}

}

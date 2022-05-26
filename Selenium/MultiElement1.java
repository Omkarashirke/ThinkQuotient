package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElement1 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("https://accounts.google.com/servicelogin/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"); 
		
		dr.findElement(By.id("identifierId")).sendKeys("omkar.shirke2894@gmail.com");
		dr.findElement(By.xpath("//span[text()='Next']")).click();
		
		dr.findElement(By.name("//span[text()='Next']")).sendKeys("Password", Keys.ENTER);

	}

}

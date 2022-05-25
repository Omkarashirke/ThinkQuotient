package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOperation {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");	
		Actions act = new Actions(dr);
		act.contextClick(dr.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
		act.contextClick(dr.findElement(By.xpath("//span[text()='Copy']"))).click();
		act.sendKeys(Keys.ENTER).perform();

	}

}

package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver5 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(3000);
		
		String titlePage = dr.getTitle();
		System.out.println(titlePage);
		
		String url = dr.getCurrentUrl();
		System.out.println(url);
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Thread.sleep(3000);
		
		//wait
		/*WebDriverWait wait = new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Grocery']")));
		
		dr.findElement(By.xpath("//div[text()='Grocery']")).click();*/
//		Thread.sleep(3000);
		
		FluentWait fw = new FluentWait(dr);
		fw.withTimeout(10, TimeUnit.SECONDS);
		fw.pollingEvery(500, TimeUnit.SECONDS);
		fw.ignoring(Exception.class);
		
		String titlePage1 = dr.getTitle();
		System.out.println(titlePage1);
		
		String url1 = dr.getCurrentUrl();
		System.out.println(url1);
		
		dr.navigate().back();
//		Thread.sleep(3000);
		dr.navigate().forward();
//		Thread.sleep(3000);
		dr.navigate().refresh();
//		Thread.sleep(3000);
		
//		dr.close();

	}

}

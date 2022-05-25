package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		//Login Facebook 
//		dr.navigate().to("https://www.facebook.com");
		
		dr.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		String titlePage = dr.getTitle();
		System.out.println(titlePage);
		
		String url = dr.getCurrentUrl();
		System.out.println(url);
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(3000);
		
//		WebElement we = dr.findElement(By.name("pincode"));
//		WebElement we = dr.findElement(By.xpath("//input[@class='_166SQN']"));
//		we.sendKeys("415612");
		
		String titlePage1 = dr.getTitle();
		System.out.println(titlePage1);
		
		String url1 = dr.getCurrentUrl();
		System.out.println(url1);
		
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().forward();
		Thread.sleep(3000);
		dr.navigate().refresh();
		Thread.sleep(3000);
		

	}

}

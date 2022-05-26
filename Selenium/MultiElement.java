package com.SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElement {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("https://www.bbc.com/");
		List<WebElement>lst = dr.findElements(By.xpath("//a"));
		System.out.println(lst.size());
		
		for(WebElement wb : lst)
		{
			String links = wb.getText();
			System.out.println(links);
		}

	}

}

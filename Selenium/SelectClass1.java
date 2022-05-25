package com.SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.facebook.com/");
		
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Select sel = new Select(dr.findElement(By.id("year")));
		List<WebElement> option = sel.getOptions();
		String year = "1994";
		for(int i=0; i<option.size(); i++)
		{
			String year1 = option.get(i).getText();
			if(year.equals(year1))
			{
				sel.selectByIndex(i);
			}
		}
		
	}

}

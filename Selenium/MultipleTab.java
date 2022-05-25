package com.SeleniumWebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTab {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.naukri.com/");
		WebElement we = dr.findElement(By.xpath("//div[text()='Companies']"));
		Actions act = new Actions(dr);
		act.moveToElement(we).build().perform(); 
		
		dr.findElement(By.linkText("Product based")).click();
		
		Set<String>windowId = dr.getWindowHandles();
		Iterator<String> itr = windowId.iterator();
		String parentId = itr.next();
		String childId = itr.next();
		dr.switchTo().window(childId);
		dr.findElement(By.xpath("//span[text()='Indian MNC (37)']/preceding-sibling::i")).click();
		
		dr.close();
		
		dr.switchTo().window(parentId);
		dr.findElement(By.xpath("//div[text()='Login']")).click();
				
		

	}

}

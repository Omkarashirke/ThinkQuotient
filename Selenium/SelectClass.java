package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.facebook.com/");
		
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		dr.findElement(By.name("firstname")).sendKeys("Omkar");
		
//		Actions act = new Actions(dr);
//		act.sendKeys(Keys.TAB);
		
		dr.findElement(By.name("lastname")).sendKeys("Shirke");
		dr.findElement(By.name("reg_email__")).sendKeys("omkars595@gmail.com");
		dr.findElement(By.name("reg_email_confirmation__")).sendKeys("omkars595@gmail.com");
		dr.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Password");
//		dr.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("28");
//		dr.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Apr");
//		dr.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1994");
		
		Select sel1 = new Select(dr.findElement(By.id("day")));
		sel1.selectByIndex(28);
		
		Select sel2 = new Select(dr.findElement(By.id("month")));
		sel2.selectByValue("4");
		
		Select sel3 = new Select(dr.findElement(By.id("year")));
		sel3.selectByVisibleText("1994");
		
		System.out.println(sel1.isMultiple());

	}

}

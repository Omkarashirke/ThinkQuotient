package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html"); 
		
		dr.findElement(By.id("alertBox")).click();
		
		Thread.sleep(2000);
		
		//Move control to alert pop up
		Alert alt1 = dr.switchTo().alert();
		String alertText = alt1.getText();
		System.out.println(alertText);
		alt1.accept();
		
		dr.findElement(By.id("confirmBox")).click();
		
		Thread.sleep(2000);
		
		Alert alt2 = dr.switchTo().alert();
		alt2.dismiss();
		
		dr.findElement(By.id("promptBox")).click();
		Alert alt3 = dr.switchTo().alert();
		alt3.sendKeys("Selenium Web Driver");
		
		Thread.sleep(2000);

		alt3.accept();
		
	}	

}

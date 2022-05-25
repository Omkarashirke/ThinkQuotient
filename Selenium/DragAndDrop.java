package com.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		//time command
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement wb1 = dr.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement wb2 = dr.findElement(By.xpath("//p[text()='Drop here']"));
		
//		WebElement wb1 = dr.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
//		WebElement wb2 = dr.findElement(By.xpath("ui-widget-header ui-droppable"));
		
		Actions act = new Actions(dr);
		act.dragAndDrop(wb1, wb2).build().perform();

	}

}

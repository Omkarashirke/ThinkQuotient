package com.SeleniumWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("file:///D:/ThinkQuotient/HTML/Drag-Drop.html");
		WebElement wb = dr.findElement(By.name("State"));
		wb.click();
		Boolean status = ((Select) wb).isMultiple();
		
		
//		Select sel = new Select(dr.findElement(By.name("State")));
//		Boolean status = sel.isMultiple();
//		System.out.println(status);
//		if(status)
//		{
//			List<WebElement>lst = sel.getOptions();
//			for(int i=0; i<lst.size(); i++)
//			{
//				String text = lst.get(i).getText(); 	
//				sel.selectByVisibleText(text);
//			}
//			sel.deselectAll();	
//			sel.selectByIndex(2);
//		}
		
	}

}

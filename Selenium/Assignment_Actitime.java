package com.TestNgPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_Actitime 
{

	WebDriver dr = new ChromeDriver();
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		
		dr.get("https://online.actitime.com/thinkquotient2/login.do");
		dr.manage().window().maximize(); 
	    dr.findElement(By.id("username")).sendKeys("thubeakash555@gmail.com");
		dr.findElement(By.name("pwd")).sendKeys("Akash@1000",Keys.ENTER);
	}
	
	 @Test
	    public void createCustomer() throws InterruptedException
	    {
		    String expectedResult = " has been created";
		    Thread.sleep(5000);
		    dr.findElement(By.xpath("//div[text()='Tasks']")).click();
		    dr.findElement(By.xpath("//div[text()='Add New']")).click();
		    Thread.sleep(3000);
		    dr.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		    Thread.sleep(3000);
		    dr.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Customer12");
		    dr.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Project");
		    dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
		    dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Big Bang Company']")).click();
		    dr.findElement(By.xpath("//div[text()='Create Customer']")).click();
		    Thread.sleep(4000);

		    String actualResult = dr.findElement(By.xpath("//span[contains(text(),'has been created')]")).getText();
		    if(actualResult.contains(expectedResult))
		    {
			System.out.println("Test Case Passed == true");
		    }
		    else
		    {
			System.out.println("Test Case Passed == false");
		    }
	     }
	 
	 @Test
		public void CreateNewProject() throws InterruptedException
		{
			String expectedResult = "has been created";

			Thread.sleep(5000);
			
			dr.findElement(By.xpath("//div[text()='Tasks']")).click();
			dr.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//div[@class='item createNewProject']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("ThinkQuotient");
			Thread.sleep(5000);
			dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
			dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Big Bang Company']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//div[text()='Create Project']")).click();
			
			String actualResult = dr.findElement(By.xpath("//span[contains(text(),'has been created')]")).getText();
			if(actualResult.contains(expectedResult))
			{
				System.out.println("Test Case Passed == true");
			}
			else
			{
				System.out.println("Test Case Passed == false");
			}
		}
	 
	 @Test
		public void NewTask() throws InterruptedException
		{
			
			dr.findElement(By.xpath("//div[text()='Tasks']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//span[@class=' hierarchySelectorButton']")).click();
			dr.findElement(By.xpath("//label[text()='Selected customers and projects']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//a[span[text()='ThinkQuotient']]")).click();
			dr.findElement(By.xpath("//div/span[text()='Close']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//div[div[div[div[div[div[div[div[div[text()='Big Bang Company']]]]]]]]]")).click();
			Thread.sleep(3000);
		}
	 
	 @Test
		public void createReport() throws InterruptedException
		{
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//div[text()='Reports']")).click();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//a/div[text()='Staff Performance']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//span[text()='Current month']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//div[text()='Previous month']")).click();
			dr.findElement(By.xpath("//button[text()='-- Hide details --']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//a[text()='Tasks']")).click();
			dr.findElement(By.xpath("//Span[text()='All Staff']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//label[text()='Include users without reported time']")).click();
			dr.findElement(By.xpath("//Span[text()='Close']")).click();
			Thread.sleep(3000);
			//dr.findElement(By.xpath("//em/a[text()='##.##']")).click();
			dr.findElement(By.xpath("//label[text()='Show leave time (in addition to time-track information)']")).click();
			dr.findElement(By.xpath("//span[text()='Generate HTML Report']")).click();
		}
		
		@Test(enabled = false)
		public void addUser() throws InterruptedException
		{
			Thread.sleep(3000);
			dr.findElement(By.xpath("//div[text()='Users']")).click();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//div[text()='New User']")).click();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//div/input[@id='createUserPanel_firstNameField']")).click();
			WebElement wb = dr.findElement(By.xpath("//div/input[@id='createUserPanel_firstNameField']"));
			wb.sendKeys("User1");
		}

		@AfterMethod
		public void LogOut() throws InterruptedException
		{
			Thread.sleep(3000);
			dr.findElement(By.id("logoutLink")).click();
		}
		@AfterClass
		public void afterClass()
		{
			dr.close(); 
		}

}

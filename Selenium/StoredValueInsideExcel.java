package com.SeleniumWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoredValueInsideExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream("D:\\AllIdPassword.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//writig value in excel sheet
		Sheet sh1 = wb.getSheet("Sheet1");
		Row rw = sh1.getRow(1);	
		
		Cell cel = rw.createCell(3);
		cel.setCellType(CellType.STRING);
		
		FileOutputStream fos = new FileOutputStream("D:\\AllIdPassword.xlsx");
		cel.setCellValue("ProjectName1");
		wb.write(fos);
		wb.close();
		
		
	}

}

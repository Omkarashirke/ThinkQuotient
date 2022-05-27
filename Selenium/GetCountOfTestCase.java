package com.SeleniumWebDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCountOfTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream fis = new FileInputStream("D:\\AllIdPassword.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh1 = wb.getSheet("Sheet1");
		int rowCount = sh1.getLastRowNum();
		System.out.println(rowCount);

	}

}

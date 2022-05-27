package com.SeleniumWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream("D:\\AllIdPassword.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh1 = wb.getSheet("Sheet1");
		
		//Row number
		Row rw = sh1.getRow(1);
		
		//get user name
		String userName = rw.getCell(1).getStringCellValue();
		System.out.println(userName);
		
		//get password
		String password = rw.getCell(2).getStringCellValue();
		System.out.println(password);
		
		//mobile number
//		int mobileNum = (int) rw.getCell(4).getNumericCellValue();
		long mobileNum = (long) rw.getCell(4).getNumericCellValue();
		System.out.println(mobileNum);
		

	}

}

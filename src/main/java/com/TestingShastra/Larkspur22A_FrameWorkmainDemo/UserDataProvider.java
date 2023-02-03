package com.TestingShastra.Larkspur22A_FrameWorkmainDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class UserDataProvider {

//	@DataProvider
//	public Object[][] signIndata() {
//		return obj;
//
//	}
	
	//(https://www.toolsqa.com/testng/testng-data-provider-excel/) IMP website
	
	@DataProvider(name="address")
	public Object[][] websiteAddress() {
	Object[][] portal={{"https://ijmeet.com/login#"}};
		return portal;
	}
	
	@DataProvider(name="pathaddress")
	public Object[][] XpathElement() {
		Object[][] portal1={{"//input[@id='email']"},{"//input[@id='password']"}};
			return portal1;
		}
	@DataProvider
	public Object[][] screenShotPath(){
		Object[][] SavedPath= {{"C:\\Users\\Nikhil\\Desktop\\Pic"}};
		return SavedPath;
	}
	
	@DataProvider(name = "login-data")
	public static Object[][] getdata() {
		// TODO Auto-generated method
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D://Company.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook book = null;
		try {
			book = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = book.getSheetAt(0);
		Object[][] obj = new Object[sheet.getLastRowNum()][2];
		String str = null;
		for (int i = 1; i <sheet.getLastRowNum(); i++) {
			for (int j = 1; j <= 2; j++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				str = cell.getStringCellValue();
				obj[i - 1][j - 1] = str; // here -1 is taken so that it will comes up in previous location because by
											// standard object return always starts from [0],[0]
											// otherwise it shows null on first test case [0][0] location
			}
		}
		return obj;
	}
	}

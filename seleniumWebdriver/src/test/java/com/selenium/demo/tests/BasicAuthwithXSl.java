package com.selenium.demo.tests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.demo.pages.BasicAuthPage;
import com.selenium.demo.pages.WebDriverInit;

public class BasicAuthwithXSl extends WebDriverInit {

	BasicAuthPage basicAuthPage;
	FileInputStream file;
	XSSFSheet sheet;
	XSSFWorkbook book;
	
@Test(description = "authontication testing", priority = 26)
	public void sucessTestAuthontication() throws Exception{

		BasicAuthwithXSl xsl = new BasicAuthwithXSl();
	    ArrayList<String> username	= xsl.readData(0);
	    ArrayList<String> password = xsl.readData(1);
		
        
          for(int i=1; i<username.size();i++)	{	
		 
        	  String sucessCred =
		  "http://"+username.get(i)+":"+password.get(i)+"@the-internet.herokuapp.com/basic_auth";
		  
		  driver.get(sucessCred);
		  
		  basicAuthPage = PageFactory.initElements(driver, BasicAuthPage.class);
		  
		  String mesg = basicAuthPage.loginMesg(); System.out.print(mesg);
		  
		  if(mesg.equals( "Congratulations! You must have the proper credentials."))
		  assertTrue(true);
		  
		  else assertTrue(false);
          }
		 
	}
	
	
	public ArrayList<String> readData(int celno) throws Exception {
		
		File testfile = new File(".\\testData\\Basic_Auth_testData.xlsx");

		FileInputStream file = new FileInputStream(testfile);
		book = new XSSFWorkbook(file);
		sheet = book.getSheetAt(0);
		
		Iterator<Row> rowIterotor = sheet.iterator();
		rowIterotor.hasNext();
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(rowIterotor.hasNext()) {
			
			list.add(rowIterotor.next().getCell(celno).getStringCellValue());
			
		}
		System.out.print(list);
		
		return list;
		
	}

}

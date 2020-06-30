package com.selenium.demo.tests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.demo.pages.BasicAuthPage;

import com.selenium.demo.pages.WebDriverInit;

public class BasicAuthTest extends WebDriverInit {

	BasicAuthPage basicAuthPage;
	
	

	@Test(priority = 8, dataProvider ="testData", description = "authontication testing")

	public void sucessTestAuthontication(String username, String password) throws Exception{
		
        System.out.print(username + " "+password);
		String sucessCred = "http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
		
		driver.get(sucessCred);

		basicAuthPage = PageFactory.initElements(driver, BasicAuthPage.class);

		String mesg = basicAuthPage.loginMesg();
		System.out.print(mesg);

		if(mesg.equals( "Congratulations! You must have the proper credentials."))
			assertTrue(true);
			
			else
				assertTrue(false);

	}
	
	@DataProvider(name= "testData")
	
	public Object[][] testDataValues(){
		
		Object [][] Internet = new Object[2][2];
		
		Internet[0][0] = "admin";
		Internet[0][1] = "admin";
		
		Internet[1][0] = "admin1";
		Internet[1][1] = "admin1";
		return Internet;
	}

}
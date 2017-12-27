package com.wrappers.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.excel.test.SampleExcel;

public class ProjectSpecificWrapper extends GenericWrapper {
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void login(String browserName,String Urlname,String uname,String paswd) throws Exception{
		invokeApp(browserName, Urlname);
		enterById("username", uname);
		enterById("password", paswd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		}
	
	@AfterMethod
	public void closingBrowser() {
		closeBrowser();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getdata() throws InvalidFormatException, IOException
	{
			SampleExcel se=new SampleExcel();
			return se.readExcel();
	}

}

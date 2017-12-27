package com.annotation.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class AnnotationTest
{
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("this is before suite");
	}

	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("this is before test");
		
	}
    @BeforeClass
	public void beforeClass()
	{
		
		System.out.println("this is executed before class");
		
	}
    @BeforeMethod
	public void beforeMethod()
	{
		
		System.out.println("this is executed before method");
		
	}

   /* @Test
	public void aman()
	{
		
		System.out.println("Aman is a good boy");
		
	}*/
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("this is executed after method");
		
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is executed afer class");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("this is executed after test");
	}
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("this is executed after suite");
	}
}
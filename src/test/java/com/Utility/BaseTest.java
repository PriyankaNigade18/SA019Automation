package com.Utility;

import org.testng.annotations.BeforeTest;

import com.DriverSession.DriverUtil;

import io.appium.java_client.AppiumDriver;

public class BaseTest 
{
	public AppiumDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=DriverUtil.initDriverSession();
		
	}
	
	

}

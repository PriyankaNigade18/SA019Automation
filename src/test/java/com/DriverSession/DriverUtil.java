package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil
{
	public static AppiumDriver driver;

	public static AppiumDriver initDriverSession()
	{
		UiAutomator2Options options=new UiAutomator2Options();
		  options.setPlatformName("Andorid");
		  
		  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		  options.setCapability("appium:app",path);
		  
		  //server address
		  URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			//Create session
			   driver=new AndroidDriver(url,options);
			  System.out.println("Sesssion id is: "+driver.getSessionId());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return driver;
		  
	}
	
}

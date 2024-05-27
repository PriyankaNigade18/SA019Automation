package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import com.Utility.Util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithUiAutomator2OptionsClass {
  @Test
  public void testSession() throws MalformedURLException 
  {
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Andorid");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app",path);
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //Create session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("Sesssion id is: "+driver.getSessionId());
	  
	  Util.getScreenshot(driver);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

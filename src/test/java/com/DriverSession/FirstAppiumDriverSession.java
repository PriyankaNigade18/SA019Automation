package com.DriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstAppiumDriverSession {
  @Test
  public void testSession() throws MalformedURLException 
  {
	  //setup all the properties to the server
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","UiAutomator2");
	  cap.setCapability("deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  //application path
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app",path);
	  
	  //Server address 
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  
	  //Start server and pass request
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  
	  System.out.println("Session Id is: "+driver.getSessionId());
	  
	  
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

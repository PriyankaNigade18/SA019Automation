package com.MobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Utility.BaseTest;

import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApplication extends BaseTest
{
  @Test
  public void testApp()
  {
	  //Current status of application
	  System.out.println("Application current status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  //terminate the app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("Application Terminated!");
	  
	  System.out.println("Application current status After terminated is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //activate the app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("Application Activated!");
	  
	  System.out.println("Application current status After activated is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  
	  //uninstall app
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("Application Uninstalled!");
	  
	  System.out.println("Application current status After remove app is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  //install app
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  ((AndroidDriver)driver).installApp(path);
	  
	  System.out.println("Application current status After installation app is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	//activate the app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("Application Activated!");
	  
	  
	  //background
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));

	  System.out.println("Application current status app is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
  }
}

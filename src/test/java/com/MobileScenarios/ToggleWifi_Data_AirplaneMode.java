package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.BaseTest;
import com.Utility.Util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ToggleWifi_Data_AirplaneMode extends BaseTest
{
	/*
	 * toggleWifi()
	 * toggleData()
	 * toggleAirplaneMode()
	 */
  @Test
  public void testNetworkSetup() throws InterruptedException
  {
	  
	  //wifi
	  System.out.println("Intially wifi is On");
	 ((AndroidDriver)driver).toggleWifi();
	 
	  System.out.println("Intially wifi is OFF");
	  Thread.sleep(1000);
	  //off to on
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Status is wifi ON");
	  
	  Thread.sleep(1000);
	  //mobile data
	  
	  WebElement ele=driver .findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  //swipe left
	  Util.swipeLeft(driver,ele);
	  Thread.sleep(1000);
	  System.out.println("Intially MobileData is ON");
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("After function MobileData is OFF");
	  Thread.sleep(1000);
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("After function MobileData is ON");
	  
	  
	  //AirplaneMode
	  System.out.println("Intially Airplane Mode is OFF");
	  //Off-->On
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  Thread.sleep(1000);
	  System.out.println("After function AirplaneMode is ON");
	  
	  //On to Off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("After function AirplaneMode is OFF");

	 
	  System.out.println("After function AirplaneMode is ON");

	  
	  
	  
	  
	  
	  
	  

  }
}

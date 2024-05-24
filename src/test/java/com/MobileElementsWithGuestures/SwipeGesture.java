package com.MobileElementsWithGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Utility.BaseTest;
import com.Utility.Util;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeGesture extends BaseTest
{
  @Test
  public void testSwipe() 
  {
	  
	  //create session-base class
	  
	  //click on Views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //Click on Gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  
	  //ele- swipe
	  
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  
	  //gesture
//	  driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//			  
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","left",
//			  "percent",1.0
//			   ));
	  
	  
	  
	  Util.swipeLeft(driver, ele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

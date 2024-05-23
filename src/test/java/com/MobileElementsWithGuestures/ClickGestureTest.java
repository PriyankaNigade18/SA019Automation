package com.MobileElementsWithGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGestureTest {
  @Test
  public void testClickGesture() 
  {
	  //create driver session
AppiumDriver driver=DriverUtil.initDriverSession();

//click on Views
//driver.findElement(AppiumBy.accessibilityId("Views")).click();

WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));

	//gesture
	driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			"elementId",((RemoteWebElement)ele).getId()
			
			));

System.out.println("Mobile Click Gesture is completed!");







	  
  }
}

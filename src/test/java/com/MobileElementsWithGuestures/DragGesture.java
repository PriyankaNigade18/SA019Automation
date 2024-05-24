package com.MobileElementsWithGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Utility.BaseTest;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragGesture extends BaseTest
{
  @Test
  public void testDragnDrop()
  {
	  //create a driver session-base class
	  
	  
	  //click on Views
	  //Views
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //click on drag n drop
	  //Drag and Drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  //element-Third dot
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  
	  //mobile gesture
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",672,
			  "endY",1119			  
			    ));
	  
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Result Message is: "+text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

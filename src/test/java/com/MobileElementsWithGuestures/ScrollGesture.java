package com.MobileElementsWithGuestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;
import com.Utility.Util;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException 
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //next window -id
	  WebElement scrollEle=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  Util.scrollDownUpToCount(driver, scrollEle, 3);
	  
	  
	  
//	  Util.scrollDown(driver, scrollEle);
//	  
//	  Thread.sleep(2000);
//	  
//	  Util.scrollup(driver, scrollEle);
	  
	  
	  
	  
	  
	  
	  //scrollGesture
	  /*
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)scrollEle).getId(),
			  "direction","down",
			  "percent",1.0
			  ));
	  
	  
	  
	  System.out.println("Scroll down is completed!");
	  Thread.sleep(2000);
	  
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)scrollEle).getId(),
			  "direction","up",
			  "percent",1.0
			  ));
	  
	  System.out.println("Scroll up is completed!");

	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

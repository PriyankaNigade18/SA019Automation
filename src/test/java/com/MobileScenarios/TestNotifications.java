package com.MobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.BaseTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class TestNotifications extends BaseTest
{
  @Test
  public void testNotifications()
  {
	  //Open Notifications
	  ((AndroidDriver)driver).openNotifications();
	  
	  //Get the Titles
	  System.out.println("***********Notifications Title*************");
	  List<WebElement> titles=driver.findElements(AppiumBy.id("android:id/title"));
	  for(WebElement i:titles)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //first message
	  String text1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println("Text for First Notification: "+text1);
	  
	  
	  System.out.println("******************All Notification Text:****************");
	  //second text/all text
//	  List<WebElement> list=driver.findElements(AppiumBy.id("com.android.systemui:id/content"));
//	  
//	  for(WebElement i:list)
//	  {
//		  System.out.println(i.getText());
//	  }
	  
	  
	  
	  WebElement ele=driver.findElements(AppiumBy.id("com.android.systemui:id/content")).get(3);
	  
	  System.out.println(ele.getText());
	  
	  
	  
  }
  
  
  
}

package com.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.BaseTest;
import com.Utility.Util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventTest extends BaseTest
{
  @Test
  public void testMobileKeywboard()
  {
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll
	  Util.scrollDownUpToCount(driver,ele,3);
	  
	  //textFields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  
	   
	  //Area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  area.click();
	  area.sendKeys("Hello All!");
	  
	  /* Keyboard
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.H));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.L));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.L));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.O));
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

package com.MobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Utility.BaseTest;

import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate extends BaseTest
{
	/*
	 * lockDevice()
	 * unlockDevice()
	 * rotate(ScreenOrientation)
	 */
  @Test
  public void testLock_Unlock_Rotate() throws InterruptedException
    {
	  /*
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device is locked!");
	  
	  Thread.sleep(1000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	 	  System.out.println("Device is Unlocked!");

	  */
	  
	  //rotate app
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  System.out.println("Application rotate to Landscape!");
	  
	  
	  
	  
	  
	  
  }
}

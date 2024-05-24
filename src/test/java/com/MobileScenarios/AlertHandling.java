package com.MobileScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Utility.BaseTest;

import io.appium.java_client.AppiumBy;

public class AlertHandling extends BaseTest
{
  @Test
  public void testAlert() 
  {
	  
	  //create a session
	  
	  //app
	  
	driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  
	  //alters
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  /*
	   * Alert is Interface in selenium
	   * For handling
	   * driver.switchTo().alert();
	   * alert() returns you Alert interface Object
	   * Methods
	   * ==============
	   * 1.Ok====>accept()
	   * 2.Cancel====>Dismiss()
	   * 3.Prompt====>sendKeys()
	   * 4.To get text of alert===>getText()
	   * 
	   */
	  
	  //alert1
	 driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	 
	 //alert window will open
	 Alert alt=driver.switchTo().alert();
	 System.out.println("Text of  the alert1: "+alt.getText());
	 //ok
	 alt.accept();
	 
	 
	
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

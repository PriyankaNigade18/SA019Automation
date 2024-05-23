package com.MobileElementsWithGuestures;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DriverSession.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void testLocators() throws InterruptedException 
    {
	  
	 //create a driver session
	  
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //identify that element1-accessibilityId
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele1.getText());
	  ele1.click();
	  
	  //come back to main screen
	  driver.navigate().back();
	  
	  //static wait
	  Thread.sleep(1000);
	  
	  //identify that element2-xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	  System.out.println("Text of Element2 is: "+ele2.getText());
	ele2.click();
	
	//come back
	driver.navigate().back();
	
	  //identify that element3-className(Animation) get all elements and use index
	WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	System.out.println("Text of Element3 is: "+ele3.getText());
	ele3.click();
	
	driver.navigate().back();
	
	//identify that element4-(resource-id or id)
	WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	System.out.println("Text of Element4 is: "+ele4.getText());
	ele4.click();
	
	//come back
	driver.navigate().back();
	
	//identify that element 5-(UiSelector)
	WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	System.out.println("Text of Element5 is: "+ele5.getText());
	ele5.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
	  
	  
	  
	  
	  
  }
}

package com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Util 
{
//screenshot
	
	public static void getScreenshot(AppiumDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"//Screenshots//App.png");
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void scrollDownUpToCount(AppiumDriver driver,WebElement scrollEle,int count)
	{
		for(int i=1;i<=count;i++)
		{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","down",
				  "percent",1.0
				  ));
		 System.out.println("Iteration Number: "+i);
		}
	}
	
	
	
	public static void scrollDown(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","down",
				  "percent",1.0
				  ));
	}
	
	
	public static void scrollup(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","up",
				  "percent",1.0
				  ));
	}
	
	
	public static void scrollRight(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","right",
				  "percent",1.0
				  ));
	}
	
	public static void scrollLeft(AppiumDriver driver,WebElement scrollEle)
	{
		 driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)scrollEle).getId(),
				  "direction","left",
				  "percent",1.0
				  ));
	}
	
	
	//Swipe utilities
	
	public static void swipeLeft(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","left",
				  "percent",1.0
				   ));
	}
	
	
	public static void swipeRight(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","right",
				  "percent",1.0
				   ));
	}
	
	public static void swipeUp(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",1.0
				   ));
	}
	
	public static void swipeDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",1.0
				   ));
	}
	
	
	
	
	
	
	
	
	
}

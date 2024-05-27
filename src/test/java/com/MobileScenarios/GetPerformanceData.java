package com.MobileScenarios;

import java.util.List;

import org.testng.annotations.Test;

import com.Utility.BaseTest;

import io.appium.java_client.android.AndroidDriver;

public class GetPerformanceData extends BaseTest
{
  @Test
  public void testPerformanceParameters() 
  {
	  /*
	   * 

	returns the information type of the system state 
	which is supported to 
	readas like cpu, memory, network traffic, and battery.

	   */
	  
	  List<String> allData=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println("Performance Data types are: "+allData);
	  
	  System.out.println("***********Memory Information*********");
	  
	  List<List<Object>> getperformanceData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  
	  System.out.println(getperformanceData);
	  
	 System.out.println("***********Battery Information*********");
	  
	  List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  
	  System.out.println(batteryData);
	  
	 System.out.println("***********Network Information*********");
	  
	  List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  
	  System.out.println(networkData);
	  
	  
  }
}

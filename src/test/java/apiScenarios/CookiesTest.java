package apiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
/*
 * given() : pre-reqiuisite
 * headers/cookies/path and query parameters/request payload /Authentication
 * 
 * when(): action(http methods)
 * GET/POST/PUT/PATCH/DELETE
 * 
 * 	then(): response validation
 * status code/message /body(response payload)/log()
 */
public class CookiesTest 
{
  @Test(priority=1)
  public void getAllCookies()
  {
	  
	 Response res= given()
			 .when()
			 .get("https://www.google.com");
	 
	 Map<String,String> allCookies=res.getCookies();
	 //System.out.println(allCookies);
	 
	 for(Map.Entry<String,String> i:allCookies.entrySet())
	 {
		 System.out.println(i.getKey()+":"+i.getValue());
	 }
	 
	 
  }
  
  
  @Test(priority=2)
  public void validateCookie()
  {
	  
	 Response res= given()
			 .when()
			 .get("https://www.google.com");
	 
	 String actCookie=res.getCookie("AEC");
	 String prevCoolie="AQTF6Hx0vzaXg4cuEEveEyr39LI02IoyaU4N_WfIq1VALkD-NtsgRwTB_K4";
	Assert.assertFalse(actCookie.equals(prevCoolie),"Test Fail: Cookies are same");
	System.out.println("Test Pass: As cookies are dynamic data so when they are different then it pass");
	
	 
	 
	 
	 
	 
  }
	 
}

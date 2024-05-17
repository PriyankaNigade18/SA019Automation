package apiScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
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
public class HeadersTest
{
  @Test(priority=1)
  public void getAllHeaders()
  {
 Response res=given()
	  
	  .when()
	  .get("https://www.google.com");
 
 	Headers hd=res.getHeaders();
 	System.out.println(hd);
 	
 	
  }
  
  @Test
  public void headervalidation()
  {
	  Response res=given()
	  
	  .when()
	  .get("https://www.google.com");
	  
	 String actheader= res.getHeader("Content-Type");
	 Assert.assertEquals(actheader,"text/html; charset=ISO-8859-1","Headers are not matched!");
	 System.out.println("Test Pass: Headers are matched!");
	 
	 
	 
	  
	  
	  
  }
  
  
}

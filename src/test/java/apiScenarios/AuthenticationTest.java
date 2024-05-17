package apiScenarios;

import org.testng.annotations.Test;
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
public class AuthenticationTest
{
  @Test
  public void basicAuth() 
  {
	  //Algorithm : Base64 encoding
	  given()
	   .auth().basic("postman","password")
	  .when()
	  .get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  System.out.println("Basic Authentication is validated!");
	  
	  
  }
  
  
  @Test
  public void digestAuth() 
  {
	  //MD5 algorithm
	  given()
	   .auth().digest("postman","password")
	  .when()
	  .get("https://postman-echo.com/digest-auth")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  System.out.println("Digest Authentication is validated!");
	  
	  
  }
  
  
  
  @Test
  public void preemtiveAuth() 
  {
	  
	  given()
	   .auth().preemptive().basic("postman","password")
	  .when()
	  .get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  System.out.println("Preemative Authentication is validated!");
	  
	  
  }
  
  
  @Test
  public void bearerAuth() 
  {
	  
	  given()
	  .header("Authorization","Bearer 12345")
	  
	  .when()
	  .get("https://postman-echo.com/")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  System.out.println("Bearer Authentication is validated!");
	  
	  
  }
  
  
  @Test
  public void oAuth2Test() 
  {
	  
	  given()
	  .auth().oauth2("12345")
	  
	  .when()
	  .get("https://postman-echo.com/")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  System.out.println("OAuth2.0 Authentication is validated!");
	  
	  
  }
}

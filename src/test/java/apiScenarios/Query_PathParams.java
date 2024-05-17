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
public class Query_PathParams {
  @Test
  public void parametersTest() 
  {
	  
	  //https:    //reqres.in/  api     /users       ?page=2
	  // protocol: domain    /  resource /path params ? query params 
	  
	  given()
	  .pathParam("apipath","users")
	  .queryParam("page",2)
	  
	  .when()
	  .get("https://reqres.in/api/{apipath}")
	  
	  .then()
	  .statusCode(200)
	  .log().all();
	  
	  
	  
	  
	  
	  
	  
  }
}

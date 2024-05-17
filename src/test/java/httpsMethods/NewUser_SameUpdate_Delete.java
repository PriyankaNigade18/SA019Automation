package httpsMethods;

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
public class NewUser_SameUpdate_Delete 
{
	
	String id;
	
  @Test(priority=1)
  public void createNewUser_Post()
  {
	  //Request payload
	  PojoData pojo=new PojoData();
	  pojo.setName("Amit");
	  pojo.setJob("QA");
	  
	    
 id=given()
	  	.contentType("application/json")
	  	.body(pojo)
	  
	  .when()
	  	.post("https://reqres.in/api/users")//request to server
	  	.jsonPath().get("id");
	  	

	System.out.println("User is created with id: "+id);
	  	
//	  .then()
//	  .statusCode(201)
//	  .log().body();
	  
  }
  
  
  @Test(priority=2,dependsOnMethods ="createNewUser_Post")
  public void sameUserUpdate_Put()
  {
	  //request Payload
	  PojoData pojo=new PojoData();
	  pojo.setName("Amit");
	  pojo.setJob("SDET");
	  
	  given()
	  .contentType("application/json")
	  .body(pojo)
	  
	  .when()
	  .put("https://reqres.in/api/users/"+id)
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  System.out.println("User updated with id: "+id);
	  
	 
	  
	  
  }
  
  
  @Test(priority=3,dependsOnMethods ="sameUserUpdate_Put")
  public void sameUserDelete()
  {
	  
	  given()
	  .when().delete("https://reqres.in/api/users/"+id)
	  .then()
	  .statusCode(204);
	  System.out.println("User deleted with id: "+id);
	  
  }
  
  
  
  
  
  
  
  
  
  
}

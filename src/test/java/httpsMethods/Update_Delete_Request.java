package httpsMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
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
public class Update_Delete_Request {
  @Test
  public void updateUser()
  {
	  //Request payload
	  PojoData data=new PojoData();
	  data.setName("Jay");
	  data.setJob("Engg");
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  	 	
	  .when()
	  .put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
  }
  @Test
  public void deleteUser()
  {
	  given()
	  .when()
	  	.delete("https://reqres.in/api/users/2")
	  
	  
	  .then()
	  .statusCode(204)
	  .log().all();
  }
}

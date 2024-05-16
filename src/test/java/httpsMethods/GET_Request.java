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
public class GET_Request
{
  @Test(priority=1)
  public void singleUserTest() 
  {
	  System.out.println("This is single user request!");
	  
	  given()
	  	.when()
	  		.get("https://reqres.in/api/users/2")
	  	.then()
	  	.assertThat()
	  	.statusCode(200)
	  	.body("data.id",equalTo(2))
	  	.body("data.email",equalTo("janet.weaver@reqres.in"))
	  	.body("data.first_name",equalTo("Janet"))
	  	.log().body();
	  	
	  
  }
  
  @Test(priority=2)
  public void listOfUsers()
  {
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .statusCode(200)
	  .body("page",equalTo(2))
	  .body("data.id[2]",equalTo(9))//single value validation
	  /*
	   * hasItems() -> Check all elements are in a collection
	   * Partial matching allowed
	   * It dosen't support strict order
	   */
	  .body("data.id",hasItems(7,8,9,10,11,12))
	  .body("data.id",hasItems(7,8,9))
	  .body("data.id",hasItems(12,7,10))
	 // .body("data.id",hasItems(12,7,10,6))//assertion error
	  
	  /*
	   * contains()
	   * contains() -> Check all elements are in a collection and in a strict order
	   * partial match is not allowed
	   */
	  .body("data.id",contains(7,8,9,10,11,12))
	  .body("data.id",contains(10,11,12))
	  .log().body();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

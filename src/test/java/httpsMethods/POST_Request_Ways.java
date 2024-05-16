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
public class POST_Request_Ways {
  @Test
  public void PostWithMap() 
  {
	  //Request PayLoad
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","Automation Trainer");
	  
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Priyanka"))
	  .log().body();
	  
	  System.out.println("New user created using HashMap!");
	  
  }
  
  
  
  
  @Test
  public void pojoWay() {
	  //Request payload
	  PojoData data=new PojoData();
	  data.setName("Sarang");
	  data.setJob("QA");
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  	
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Sarang"))//json validation
	  .log().body();
	  
	  //validation for java object
	  System.out.println(data.getName().equals("Sarang"));
	  System.out.println(data.getJob().equals("QA"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}

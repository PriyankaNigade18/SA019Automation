package apiScenarios;

import org.testng.annotations.Test;
/*
 * Serialization :POJO====>JSON
 * De-serialization: JSON===>POJO
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import httpsMethods.PojoData;

public class Serialization_Deserialization {
  @Test
  public void serializationTest() throws JsonProcessingException 
  {
	  //Pojo object
	  PojoData pojo=new PojoData();
	  pojo.setName("Kiran");
	  pojo.setJob("QA");
	  
	  //JSon
	  
	  ObjectMapper obj=new ObjectMapper();
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
	  System.out.println(json);
	  
	  
  }
  
  
  
  
  @Test 
  public void deserializationTest() throws JsonMappingException, JsonProcessingException
  {
	  //json data
	  String json="{\n"
	  		+ "  \"name\" : \"Kiran\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  
	  ObjectMapper obj=new ObjectMapper();
	 PojoData pojo= obj.readValue(json,PojoData.class);
			  
	 System.out.println(pojo.getName().equals("Kiran"));
	 System.out.println(pojo.getJob().equals("QA"));
	  
	  
	  
	  
  }
  
  
}

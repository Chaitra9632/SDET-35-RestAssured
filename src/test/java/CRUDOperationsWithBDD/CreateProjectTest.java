package CRUDOperationsWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class CreateProjectTest {
	
	@Test
	public void createProject()
	{
		//Step1: create required data
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Abhishek");
		jobj.put("projectName", "Xylem");
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);
		
		//Step 2: Send the request
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when() 
		 .post("http://localhost:8084/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

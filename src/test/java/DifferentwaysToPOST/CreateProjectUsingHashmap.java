package DifferentwaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHashmap {
	
	@Test
	public void createP()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//create data
		HashMap map = new HashMap();
		map.put("createdBy", "Rahul");
		map.put("projectName", "Xylem");
		map.put("status", "Created");
		map.put("teamSize", 12);
		
		//send request and validate response
		given()
		  .body(map)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		   .assertThat().statusCode(201).log().all();
		
		
		
		
		
		
		
		
	}

}

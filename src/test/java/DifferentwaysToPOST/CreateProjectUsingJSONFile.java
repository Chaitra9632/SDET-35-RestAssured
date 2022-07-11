package DifferentwaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJSONFile {
	
	@Test
	public void createP()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//create data
		File file = new File(".\\TestData\\data.json");
		
		//send the request validate the response
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
	    .when()
	     .post("/addProject")
	    .then().log().all();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

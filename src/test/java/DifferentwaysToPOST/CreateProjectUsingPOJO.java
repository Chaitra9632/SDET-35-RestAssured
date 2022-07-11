package DifferentwaysToPOST;

import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPOJO {
	
	@Test
	public void createP()
	{
		Random ran = new Random();
		int random = ran.nextInt(200);
		
		baseURI = "http://localhost";
		port = 8084;
		
		//create data
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "tyss-"+random, "Created", 24);
		
		//send request and validate response
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
	}

}

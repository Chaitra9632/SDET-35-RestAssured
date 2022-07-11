package RequestChaining;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateGetDelete {
	
	@Test
	public void createGetDeleteTest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		Random r = new Random();
		int ran = r.nextInt(200);
		
		//Step 1: create the project using POST()
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "RMG-"+ran, "Created", 22);
		
		Response resp = given()
						.body(pLib)
						.contentType(ContentType.JSON)
						.when()
						.post("/addProject");
		
		//Step 2: Retrive the projectID using jsonPath() from Response
		String proID = resp.jsonPath().get("projectId");
		Reporter.log(proID,true);
		
		//Step 3: Use the projectID to Do GET() and log it in response
		given()
		 .pathParam("pid", proID)
		.when()
		  .get("/projects/{pid}")
		.then().log().all();
		
		//Step 4: Use the same projectID to do DELETE() and verify the status Code
		given()
		  .pathParam("pid", proID)
		.when()
		  .delete("/projects/{pid}")
		.then().assertThat().statusCode(204).log().all();
	}

}
